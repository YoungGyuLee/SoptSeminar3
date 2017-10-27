package com.yg.a3rdseminar

/**
 * Created by 2yg on 2017. 10. 25..
 */
data class PokemonData (
        var pokemonImage : Int,
        var pokemonType : String,
        var pokemonName : String
)
/** data class : 오로지 데이터만 담은 클래스입니다. 자바에서 흔히 접하는 생성자, getter/setter를 별도로 만들지 않고
 *               단순히 자신이 사용할 '데이터'만으로 클래스 생성 가능
 * */