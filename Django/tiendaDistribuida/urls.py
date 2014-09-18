from django.conf.urls import patterns, include, url
from django.contrib import admin

urlpatterns = patterns('',
    url(r'^$', 'tienda.views.home', name='home'),

    url(r'^login/$', 'tienda.views.loginUser', name='login'),
    url(r'^signin/$', 'tienda.views.signinUser', name='signin'),
    url(r'^exit/$', 'tienda.views.exitSession', name='exit'),

    url(r'^stuff/$', 'tienda.views.stuff', name='stuff'),
    url(r'^stuff/category/(\d+)/$', 'tienda.views.category', name='category'),
    
    url(r'^purchases/$', 'tienda.views.purchases', name='purchases'),

    url(r'^admin/', include(admin.site.urls)),
)
