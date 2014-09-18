# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.db import models, migrations


class Migration(migrations.Migration):

    dependencies = [
        ('tienda', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='category',
            name='relates_to',
            field=models.ForeignKey(to='tienda.Category', blank=True),
        ),
    ]
