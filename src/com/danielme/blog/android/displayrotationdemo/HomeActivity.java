/*
* Copyright (C) 2012 Daniel Medina <http://danielme.com>
*
* This file is part of "Android Display Rotation Demo".
*
* "Android Display Rotation Demo" is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, version 3.
*
* "Android Display Rotation Demo" is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License version 3
* along with this program. If not, see <http://www.gnu.org/licenses/gpl-3.0.html/>
*/
package com.danielme.blog.android.displayrotationdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
	}

	public void defaultBehavior(View button)
	{
		startActivity(new Intent(this, DefaultActivity.class));
	}

	public void defaultRetain(View button)
	{
		startActivity(new Intent(this, DefaultRetainDataActivity.class));
	}

	public void diy(View button)
	{
		startActivity(new Intent(this, DIYActivity.class));
	}
	
	public void lock(View button)
	{
		startActivity(new Intent(this, LockActivity.class));
	}
}