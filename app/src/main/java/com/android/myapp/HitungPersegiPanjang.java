package com.android.myapp;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class HitungPersegiPanjang extends Activity {
    private EditText txtPanjang;
    private EditText txtLebar;
    private EditText txtLuas;
    private Button btnHitung;

    /**
     * Method yang dipanggil pada saat applikaasi dijalankan
     * */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegipanjang);
        txtPanjang = (EditText) findViewById(R.id.txtPanjang);
        txtLebar = (EditText) findViewById(R.id.txtLebar);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);

    }


    /**
     * Method untuk Menghitung Luas Persegi panjang dipanggil pada saat button
     * Hitung Luas diklik
     *
     * @param view
     */
    public void hitungLuas(View view) {
        try {

            double panjang = Double.parseDouble(txtPanjang.getText().toString());
            double lebar = Double.parseDouble(txtLebar.getText().toString());
            double luas = panjang * lebar;
            txtLuas.setText(String.valueOf(luas));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method untuk menutup activity dan kembali ke menu
     * @param view
     */
    public void backtoMenu(View view){
        finish();
    }
}