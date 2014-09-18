from django.shortcuts import render, render_to_response, get_object_or_404
from django.http import HttpResponseRedirect
from django.template import RequestContext

from django.contrib.auth import authenticate, login, logout
from django.contrib.auth.models import User

from models import *

from django.contrib.auth.decorators import login_required

@login_required(login_url='/login')
def home(request):
	diccionario = {'username':request.user}
	return render(request, 'index.html', diccionario)

def loginUser(request):
	message = ''

	if request.method == 'POST':
		username = request.POST.get('username', '')
		password = request.POST.get('password', '')
		user = authenticate(username=username, password=password)

		if user is not None:
			if user.is_active:
				login(request, user)
				return HttpResponseRedirect('/')
			else:
				message = "Ups, disabled account"
		else:
			message = 'Ups, this is not a valid user'

	diccionario = {'message': message,}
	return render_to_response('login.html', diccionario, context_instance=RequestContext(request))

@login_required(login_url='/login')
def exitSession(request):
	logout(request)
	return HttpResponseRedirect('/')

def signinUser(request):
	message = ''

	if request.method == 'POST':
		name = request.POST.get('name', '')
		username = request.POST.get('username', '')
		email = request.POST.get('email', '')
		password = request.POST.get('password', '')

		usuarios = User.objects.all()
		exist = False

		for e in usuarios:
			if e.username == username:
				exist = True

		if not exist:
			user = User.objects.create_user(username=username, email=email, password=password, first_name=name)
			return HttpResponseRedirect('/')

		else:
			message = 'The username already exists'

	diccionario = {'message': message,}
	return render_to_response('signin.html', diccionario, context_instance=RequestContext(request))

@login_required(login_url='/login')
def stuff(request):
	categories = Category.objects.all()
	diccionario = {'categories': categories,}
	return render_to_response('stuff.html', diccionario, context_instance=RequestContext(request))

@login_required(login_url='/login')
def category(request, idCategory):
	message = ''
	category = get_object_or_404(Category, id=int(idCategory))
	products = Product.objects.filter(category=category)
	if request.method == 'POST':
		product = get_object_or_404(Product, id=int(request.POST.get('product', '')))
		quantityWaited = request.POST.get('quantity', '')
		if int(quantityWaited) > product.stock:
			message = 'Ups, you request more products that we have'
			HttpResponseRedirect(request.path)
		else:
			product.stock -= int(quantityWaited)
			product.save()
			price = int(quantityWaited)*product.price
			print price
			newSale = Sale(user=request.user, product=product, quantity=int(quantityWaited), price=price)
			newSale.save()
			message = 'Product added to your billing state'
			HttpResponseRedirect(request.path)

	diccionario = {'category':category, 'products':products, 'message':message}
	return render_to_response('category.html', diccionario, context_instance=RequestContext(request))

@login_required(login_url='/login')
def purchases(request):
	purchases = Sale.objects.filter(user=request.user)
	print purchases
	diccionario = {'purchases': purchases}
	return render_to_response('purchases.html', diccionario, context_instance=RequestContext(request))



