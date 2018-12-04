package quizapp.iniyan.com.quizapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

import quizapp.iniyan.com.quizapp.Model.Category;
import quizapp.iniyan.com.quizapp.R;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {
    Context context;
    List<Category> categoryList;

    public CategoryAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public CategoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_category_item, viewGroup, false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.MyViewHolder myViewHolder, int i) {




        myViewHolder.txt_Category_name.setText();
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView txt_Category_name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            cardView = (CardView) itemView.findViewById(R.id.card_category);
            txt_Category_name = (TextView) itemView.findViewById(R.id.txt_category_name);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Click at Category" + categoryList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
