package com.example.traveltickets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OffersAdapter : RecyclerView.Adapter<OffersAdapter.OfferViewHolder>() {

    private val offers = listOf(
        Offer("Die Antwoord", "Будапешт", "22 264 ₽", R.drawable.ic_launcher_background),
        // Добавьте другие предложения
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_offer, parent, false)
        return OfferViewHolder(view)
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        val offer = offers[position]
        holder.bind(offer)
    }

    override fun getItemCount(): Int = offers.size

    class OfferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val ivImage: ImageView = itemView.findViewById(R.id.artistImage)
        private val tvTitle: TextView = itemView.findViewById(R.id.artistName)
        private val tvTown: TextView = itemView.findViewById(R.id.tvTown)
        private val tvPrice: TextView = itemView.findViewById(R.id.tvPrice)

        fun bind(offer: Offer) {
            ivImage.setImageResource(offer.imageResId)
            tvTitle.text = offer.title
            tvTown.text = offer.town
            tvPrice.text = offer.price
        }
    }

    data class Offer(val title: String, val town: String, val price: String, val imageResId: Int)
}