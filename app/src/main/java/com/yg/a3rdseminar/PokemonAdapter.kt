package com.yg.a3rdseminar

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by 2yg on 2017. 10. 25..
 */


/***
 * 어댑터는 데이터와 화면 출력을 이어주는 객체입니다 여기서는 PokemonData에 넣은 데이터들을 ViewHolder로 연결하기 위해 쓰였습니다 **/
class PokemonAdapter(var dataList : ArrayList<PokemonData>?) : RecyclerView.Adapter<PokemonViewHolder>() {
    /**(var dataList : ArrayList<PokemonData>?) 이 부분은 생성자입니다.
     * 그런데 단순한 생성자가 아니라 클래스 '내부 변수를 초기화 시켜주는 역할'까지 하는 생성자입니다.
     * 이해를 돕기 위해 자바에서 위와 같은 식이 어떤 건지 클래스 아래에 주석처리 하였으니 참고 바랍니다
     **/
    private var onItemClick : View.OnClickListener? = null

    override fun onBindViewHolder(holder: PokemonViewHolder?, position: Int) {
        holder!!.pokemonImage.setImageResource(dataList!!.get(position).pokemonImage)
        holder!!.pokemonType.text = dataList!!.get(position).pokemonType
        holder!!.pokemonName.text = dataList!!.get(position).pokemonName
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PokemonViewHolder {
        val mainView : View = LayoutInflater.from(parent!!.context).inflate(R.layout.pokemon_items, parent, false)
        mainView.setOnClickListener(onItemClick)
        return PokemonViewHolder(mainView)
    }

    override fun getItemCount(): Int = dataList!!.size

    fun setOnItemClickListener(l:View.OnClickListener){
        onItemClick = l
    }

}

/*
* class PokemonAdapter extends RecyclerView~~(){
*   ArrayList<PokemonData> dataList;
*   PokemonAdapter(ArrayList<PokemonData dataList){
*       this.dataList = dataList;
*   }
* }
*
* */