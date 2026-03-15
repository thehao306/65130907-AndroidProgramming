package ntu.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Khai báo các đối tượng gắn với đkhiển tương ừng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void TimDieuKhien(){
        editTextSo1 = (EditText) findViewById(R.id.editSo1);
        editTextSo2 = (EditText) findViewById(R.id.editSo2);
        EditText editTextKQ = (EditText) findViewById(R.id.editKQ);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    // Xử lí Cộng
    void XuLyCong(View v){
        // B1. Lấy dữ liệu 2 số
        // B1.1 Tìm EditText số 1 và số 2
//        EditText editTextSo1 = (EditText) findViewById(R.id.editSo1);
//        EditText editTextSo2 = (EditText) findViewById(R.id.editSo2);
        // B1.2 lấy dữ liệu từ 2 đkhiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        // B1.3 Chuyển dữ liệu từ chuỗi sang só
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // B2 Tính toán
        float Tong = soA + soB;
        // B3 Hiện kết quả
        // B3.1
//        EditText editTextKQ = (EditText) findViewById(R.id.editKQ);
        // B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        // B3.3 Gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);

    }
    // Xử lí Trừ
    void XuLyTru(View v){
        // B1. Lấy dữ liệu 2 số
        // B1.1 Tìm EditText số 1 và số 2
//        EditText editTextSo1 = (EditText) findViewById(R.id.editSo1);
//        EditText editTextSo2 = (EditText) findViewById(R.id.editSo2);
        // B1.2 lấy dữ liệu từ 2 đkhiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        // B1.3 Chuyển dữ liệu từ chuỗi sang só
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // B2 Tính toán
        float Tong = soA * soB;
        // B3 Hiện kết quả
        // B3.1
//        EditText editTextKQ = (EditText) findViewById(R.id.editKQ);
        // B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        // B3.3 Gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
    // Xử lí Nhân
    void XuLyNhan(View v){
        // B1. Lấy dữ liệu 2 số
        // B1.1 Tìm EditText số 1 và số 2
//        EditText editTextSo1 = (EditText) findViewById(R.id.editSo1);
//        EditText editTextSo2 = (EditText) findViewById(R.id.editSo2);
        // B1.2 lấy dữ liệu từ 2 đkhiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        // B1.3 Chuyển dữ liệu từ chuỗi sang só
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // B2 Tính toán
        float Tong = soA + soB;
        // B3 Hiện kết quả
        // B3.1
//        EditText editTextKQ = (EditText) findViewById(R.id.editKQ);
        // B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        // B3.3 Gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);

    }
    // Xử lí Chia
    void XuLyChia(View v){
        // B1. Lấy dữ liệu 2 số
        // B1.1 Tìm EditText số 1 và số 2
//        EditText editTextSo1 = (EditText) findViewById(R.id.editSo1);
//        EditText editTextSo2 = (EditText) findViewById(R.id.editSo2);
        // B1.2 lấy dữ liệu từ 2 đkhiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        // B1.3 Chuyển dữ liệu từ chuỗi sang só
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // B2 Tính toán
        float Tong = soA / soB;
        // B3 Hiện kết quả
        // B3.1
//        EditText editTextKQ = (EditText) findViewById(R.id.editKQ);
        // B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        // B3.3 Gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);

    }
}