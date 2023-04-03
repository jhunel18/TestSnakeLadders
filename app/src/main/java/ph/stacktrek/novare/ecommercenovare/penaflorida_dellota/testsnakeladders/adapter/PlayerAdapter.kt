package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.R
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.PlayerItemBinding

class PlayerAdapter(private val playerList: List<String>) : RecyclerView.Adapter<PlayerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val binding = LayoutInflater.from(parent.context).inflate(R.layout.player_item, parent, false)
        return PlayerViewHolder(binding)

    }
    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        holder.bind(playerList[position])
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

}

class PlayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding: PlayerItemBinding = PlayerItemBinding.bind(itemView)
    private val playerIcon = binding.playerIcon
    private val playerName = binding.playerNameText

    fun bind(playerNameString: String) {
        playerName.text = playerNameString
        // set player icon based on playerNameString or any other logic you want
        playerIcon.setImageResource(R.drawable.ic_player)
    }

}
