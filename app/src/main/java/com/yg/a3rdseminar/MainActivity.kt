package com.yg.a3rdseminar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var pokemonList : RecyclerView? = null
    private var pokemonDatas : ArrayList<PokemonData>? = null
    private var adapter : PokemonAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pokemonList = findViewById(R.id.main_list) as RecyclerView
        pokemonList!!.layoutManager = LinearLayoutManager(this)

        pokemonDatas = ArrayList<PokemonData>()
        pokemonDatas!!.add(PokemonData(R.drawable.pic1, "전기타입", "피카츄"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic2, "풀타입", "이상해씨"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic3, "불꽃타입", "파이리"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic4, "물타입", "꼬부기"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic1, "전기타입", "피카츄"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic2, "풀타입", "이상해씨"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic3, "불꽃타입", "파이리"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic4, "물타입", "꼬부기"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic1, "전기타입", "피카츄"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic2, "풀타입", "이상해씨"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic3, "불꽃타입", "파이리"))
        pokemonDatas!!.add(PokemonData(R.drawable.pic4, "물타입", "꼬부기"))

//        adapter = PokemonAdapter(arrayListOf(
//                PokemonData(R.drawable.pic1, "전기타입", "피카츄"),
//                PokemonData(R.drawable.pic2, "풀타입", "이상해씨"),
//                PokemonData(R.drawable.pic3, "불꽃타입", "파이리"),
//                PokemonData(R.drawable.pic4, "물타입", "꼬부기"),
//                PokemonData(R.drawable.pic1, "전기타입", "피카츄"),
//                PokemonData(R.drawable.pic2, "풀타입", "이상해씨"),
//                PokemonData(R.drawable.pic3, "불꽃타입", "파이리"),
//                PokemonData(R.drawable.pic4, "물타입", "꼬부기"),
//                PokemonData(R.drawable.pic1, "전기타입", "피카츄"),
//                PokemonData(R.drawable.pic2, "풀타입", "이상해씨"),
//                PokemonData(R.drawable.pic3, "불꽃타입", "파이리"),
//                PokemonData(R.drawable.pic4, "물타입", "꼬부기"),
//                PokemonData(R.drawable.pic1, "전기타입", "피카츄"),
//                PokemonData(R.drawable.pic2, "풀타입", "이상해씨"),
//                PokemonData(R.drawable.pic3, "불꽃타입", "파이리"),
//                PokemonData(R.drawable.pic4, "물타입", "꼬부기")
//        ))

        adapter = PokemonAdapter(pokemonDatas)

        adapter!!.setOnItemClickListener(this)

        pokemonList!!.adapter = adapter
    }



    override fun onClick(v: View?) {
        val idx : Int = pokemonList!!.getChildAdapterPosition(v)


        val name : String? = pokemonDatas!!.get(idx).pokemonName
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }
}
