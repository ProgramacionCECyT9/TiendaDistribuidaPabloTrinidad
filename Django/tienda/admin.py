from django.contrib import admin
from models import Category, Product, Sale

class CategoryAdmin(admin.ModelAdmin):
	list_display = ('id', 'name', 'relates_to',)
	search_fields = ('id', 'name', 'relates_to',)

class ProductAdmin(admin.ModelAdmin):
	list_display = ('id', 'price', 'stock', 'category',)
	search_fields = ('id', 'price', 'stock', 'category',)

class SaleAdmin(admin.ModelAdmin):
	list_display = ('id', 'user', 'product', 'quantity', 'price', 'date',)
	search_fields = ('id', 'user', 'product', 'quantity', 'price', 'date',)

admin.site.register(Category, CategoryAdmin)
admin.site.register(Product, ProductAdmin)
admin.site.register(Sale, SaleAdmin)