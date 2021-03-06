package com.ctt.whatzap

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctt.whatzap.model.Contato

//SEGUNDO PASSO A SER LIDO
//Responsável por vincular os dados vindos da listaContatos ao XML item_contato (célula/item da lista)
class ConversasAdapter(private val listaContatos: MutableList<Contato>) : RecyclerView.Adapter<ConversasAdapter.ConversaHolder>(){

    //PRIMEIRO PASSO A SER LIDO
    //Item final a ser visualizado e inserido na RecyclerView
    class ConversaHolder(view: View) : RecyclerView.ViewHolder(view){
        val nomeContato: TextView = view.findViewById(R.id.txtContato)
        val ultimaMensagem: TextView = view.findViewById(R.id.txtMensagem)
        val horaMensagem: TextView = view.findViewById(R.id.txtHorario)
    }

    //Equivalente ao onCreate da Activity, só que no caso, da nossa célula/item
    //Da RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversaHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.item_contato, parent, false)

        return ConversaHolder(view)
    }

    //Responsável por VINCULAR os dados com os componentes do xml
    //Contato da lista = texto de contato do xml
    override fun onBindViewHolder(holder: ConversaHolder, position: Int) {
        holder.nomeContato.text = listaContatos[position].nome
        holder.ultimaMensagem.text = listaContatos[position].ultimaMensagem
        holder.horaMensagem.text = listaContatos[position].horarioMensagem
    }

    override fun getItemCount(): Int {
        return listaContatos.size
    }
}
