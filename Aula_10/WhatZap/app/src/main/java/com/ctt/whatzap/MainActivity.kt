package com.ctt.whatzap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ctt.whatzap.model.Contato
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.jvm.internal.AdaptedFunctionReference

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        PASSOS PARA SE CRIAR UMA RECYCLERVIEW
//                1. TENHA EM MÃOS OS SEUS DADOS (UMA MUTABLELISTOF POR EXEMPlO)
//                2. JÁ TENHA CRIADO A RECYCLERVIEW EM SEU XML
//                3. JÁ TENHA CRIADO O ITEM DA SUA LISTA EM XML
//                4. CRIE O SEU ADAPTER, INDIQUE QUE O ITEM DA SUA EM XML É O ITEM DA RECYCLERVIEW VIA ONCREATEVIEWHOLDER
//                5. CRIE SUA CLASSE VIEWHOLDER, ENCONTRE OS ITENS EM SEU XML COM FINDVIEWBYID
//                6. VINCULE OS DADOS PASSADOS VIA ADAPTER AOS COMPONENTES VIA ONBINDVIEWHOLDER
//                7. VINCULE O ADAPTER DA SUA RECYCLERVIEW A UMA INSTANCIA DA SUA CLASSE ADAPTER COM SEUS DADOS
//                8. VINCULE UM GERENCIADOR DE LAYOUT (LAYOUT MANAGER) A SUA RECYCLERVIEW

        //DADOS
        val listaConversa = mutableListOf<Contato>(
            Contato(imagem = null, nome = "Henrique", ultimaMensagem = "Vou pagar a breja!", horarioMensagem = "8:01 PM"),
            Contato(imagem = null, nome = "Priscilla", ultimaMensagem = "Vou pagar a porção!!", horarioMensagem = "7:35 PM"),
            Contato(imagem = null, nome="André", ultimaMensagem = "Gente, vamos beber para esquecer os B.O.", horarioMensagem = "7:05 PM")
        )

        val rvConversas = findViewById<RecyclerView>(R.id.listaContatos)
        rvConversas.adapter = ConversasAdapter(listaConversa)

        //1. LinearLayout = Dispor os elementos em coluna única na vertical (padrão) OU horizontal
        //2. GridLayout = Dispor os elementos em mais de uma coluna, como uma tabela
        //3. StaggeredGridLayout = Dispor os elementos em mais de uma coluna, sem tamanho fixo
        rvConversas.layoutManager = LinearLayoutManager(this)

        //val exemploAchandoRecyclerViewComKotlin = listaContatos
    }
}