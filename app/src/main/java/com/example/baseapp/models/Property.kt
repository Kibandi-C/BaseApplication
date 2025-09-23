/*
MAKE SURE TO CHANGE THE CLASS AND
CONSTRUCTORS NAMES TO MATCH WHATEVER YOU WANT TO UPLOAD

THEN REFLECT THE SAME CHANGES IN THE DATA ITEM VIEW MODEL

its remaining as it is to avoid errors
*/


package com.example.baseapp.models

class Property {
    var propertyType:String = ""
    var price:String = ""
    var buyORrent:String = ""
    var propertyLocation:String = ""
    var phoneNumber:String = ""
    var imageUrl:String = ""
    var id:String = ""


    constructor(
        propertyType: String,
        buyORrent: String,
        price: String,
        propertyLocation:String,
        phoneNumber:String,
        imageUrl: String,
        id: String
    )
    {
        this.propertyType = propertyType
        this.price = price
        this.buyORrent = buyORrent
        this.propertyLocation = propertyLocation
        this.phoneNumber = phoneNumber
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}