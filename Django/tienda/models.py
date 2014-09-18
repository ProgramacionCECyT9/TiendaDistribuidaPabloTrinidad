from django.db import models
from django.contrib.auth.models import User

class Category(models.Model):
	name = models.CharField(max_length=100)
	relates_to = models.ForeignKey('self', blank=True, null=True)

	def __unicode__(self):
		return self.name

class Product(models.Model):
	name = models.CharField(max_length=255)
	price = models.DecimalField(default=0.0, max_digits=20, decimal_places=2)
	stock = models.IntegerField(default=0)
	category = models.ForeignKey(Category)

	def __unicode__(self):
		return self.name

class Sale(models.Model):
	user = models.ForeignKey(User)
	product = models.ForeignKey(Product)
	quantity = models.IntegerField(default=0)
	price = models.DecimalField(default=0.0, max_digits=1000, decimal_places=10)
	date = models.DateField(auto_now=True)

	def __unicode__(self):
		titulo = self.user.username + " compro: " + self.product.name
		return titulo