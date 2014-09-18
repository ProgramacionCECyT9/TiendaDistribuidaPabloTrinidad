# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.db import models, migrations


class Migration(migrations.Migration):

    dependencies = [
        ('tienda', '0002_auto_20140912_1848'),
    ]

    operations = [
        migrations.AlterField(
            model_name='category',
            name='relates_to',
            field=models.ForeignKey(blank=True, to='tienda.Category', null=True),
        ),
    ]
