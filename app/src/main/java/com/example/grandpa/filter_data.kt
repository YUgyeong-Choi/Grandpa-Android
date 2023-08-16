package com.example.grandpa

data class filter_data(
    //금액
    var depositFrom: Int,
    var depositTo: Int,
    var monthPriceFrom: Int,
    var monthPriceTo: Int,
    //지역
    var Gwangjin: Boolean,
    var Nowon: Boolean,
    var Seongbuk: Boolean,
    //건물 유형
    var apartment: Boolean,
    var officetel: Boolean,
    var villa: Boolean,
    var house: Boolean,
    //방 크기
    var small: Boolean,
    var medium: Boolean,
    var big: Boolean,
    var bigger: Boolean,
    //옵션
    var bathroom: Boolean,
    var kitchen: Boolean,
    var bed: Boolean,
    var laundary: Boolean,
    var aircon: Boolean,
    var elivator: Boolean,
    var desk: Boolean,
    var feeParking: Boolean,
    var freeParking: Boolean,
    var closet: Boolean,
    var internet: Boolean,
    var tv: Boolean
)
