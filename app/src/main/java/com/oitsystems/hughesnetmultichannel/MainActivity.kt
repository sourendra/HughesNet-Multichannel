package com.oitsystems.hughesnetmultichannel

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.oitsystems.hughesnetmultichannel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
//        val resourcesList = getResourcesList().toString()
//        mainBinding.textResources.text = resourcesList
        getResourcesList()
    }

    @SuppressLint("SetTextI18n")
    private fun getResourcesList() {
        val app_name = this.resources.getString(R.string.app_name)
        val name = this.resources.getString(R.string.name)
        val status_200 = this.resources.getString(R.string.status_200)
        val status_404 = this.resources.getString(R.string.status_404)
        val address = this.resources.getString(R.string.address)
        val gratitude = this.resources.getString(R.string.gratitude)
        val country = resources.getStringArray(R.array.country)
        val sex = resources.getStringArray(R.array.sex)
        mainBinding.textAppName.text = app_name
        mainBinding.textName.text = "Regex for Name: $name"
        mainBinding.textStatus200.text = "Status Code 200: $status_200"
        mainBinding.textStatus404.text = "Status Code 404: $status_404"
        mainBinding.textAddress.text = "Address: $address"
        mainBinding.textGratitude.text = "Gratitude: $gratitude"
        mainBinding.textCountry.text = "Country: "
        mainBinding.textSex.text = "Sex: "
        val countryAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country)
        mainBinding.spinnerCountry.adapter = countryAdapter
        val sexAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sex)
        mainBinding.spinnerSex.adapter = sexAdapter
    }
}
