package com.yg.a3rdseminar

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by 2yg on 2017. 10. 25..
 */
class PokemonViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var pokemonImage : ImageView = itemView!!.findViewById(R.id.pokemon_list_image) as ImageView
    var pokemonType : TextView = itemView!!.findViewById(R.id.pokemon_list_type) as TextView
    var pokemonName :TextView =  itemView!!.findViewById(R.id.pokemon_list_name) as TextView

}
/**ViewHolder는 각 리스트에 어떤 뷰가 들어가는지 설정해주는 부분입니다. 위와 같이 한 번 설정해주면 몇번이고 재사용이 가능합니다
 * */