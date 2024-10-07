package com.example.btvn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements InterfaceOnClick.iOnClickItem2 {

    private List<ListItem> list;
    private List<ListItem> list2;
    private RecyclerView rcv;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list = new ArrayList<>();
        list2 = new ArrayList<>();
        rcv = findViewById(R.id.rcv);
        toolbar = findViewById(R.id.tb);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        data();
        String[] myStringArray = getResources().getStringArray(R.array.my_string_list);

        String s = getIntent().getStringExtra("string");

        toolbar.setTitle(s);
        for (ListItem l : list) {
            if (l.getTheLoai().equals(s)) {
                list2.add(l);
            }
        }


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        Adapter2 adapter2 = new Adapter2(list2, this);
        rcv.setLayoutManager(layoutManager);
        rcv.setAdapter(adapter2);

    }

    public void data() {
        list.add(new ListItem("Truyện cười 1", "Tại sao các nhân viên văn phòng không bao giờ chơi trốn tìm? Bởi vì ai cũng sẽ nói 'Tôi đang bận!'", "Công sở"));
        list.add(new ListItem("Truyện cười 2", "Sếp hỏi nhân viên: 'Nếu tôi cho bạn một triệu đồng để nghỉ việc, bạn sẽ làm gì?' Nhân viên đáp: 'Sẽ viết đơn ngay!'", "Công sở"));
        list.add(new ListItem("Truyện cười 3", "Hai nhân viên nói chuyện: 'Bạn có biết làm thế nào để đuổi kịp deadline không?' 'Đơn giản, hãy đi chậm lại!'", "Công sở"));
        list.add(new ListItem("Truyện cười 4", "Tại sao máy photocopy lại buồn? Bởi vì nó luôn cảm thấy bị sao chép!", "Công sở"));
        list.add(new ListItem("Truyện cười 5", "Nhân viên: 'Sếp ơi, tôi muốn xin nghỉ phép.' Sếp: 'Tốt! Tôi cũng vậy, chúng ta cùng đi chơi!'", "Công sở"));
        list.add(new ListItem("Truyện cười 6", "Một nhân viên nói với đồng nghiệp: 'Tôi vừa mua một chiếc bàn mới!' Đồng nghiệp: 'Và bạn sẽ không phải làm việc nữa?'", "Công sở"));
        list.add(new ListItem("Truyện cười 7", "Sếp hỏi nhân viên: 'Bạn có cần hỗ trợ gì không?' Nhân viên: 'Chỉ cần cho tôi một tách cà phê!'", "Công sở"));
        list.add(new ListItem("Truyện cười 8", "Một nhân viên đến văn phòng muộn. Sếp hỏi: 'Sao lại muộn?' Nhân viên: 'Tôi đang cứu một chiếc xe bus!'", "Công sở"));
        list.add(new ListItem("Truyện cười 9", "Sếp nói: 'Hãy đặt công việc lên hàng đầu!' Nhân viên đáp: 'Nếu vậy, tôi sẽ phải nghỉ làm ngay!'", "Công sở"));
        list.add(new ListItem("Truyện cười 10", "Tại sao không nên kết hôn với đồng nghiệp? Bởi vì bạn sẽ phải viết một báo cáo cho cuộc sống hôn nhân!", "Công sở"));


        list.add(new ListItem("Truyện cười 11", "Hai vợ chồng cãi nhau. Vợ bảo: 'Anh không bao giờ giúp việc nhà.' Chồng trả lời: 'Thì em bảo anh nấu cơm, anh đi mua cơm rồi mà!'", "Cực hài"));
        list.add(new ListItem("Truyện cười 12", "Ông chủ hỏi nhân viên: 'Anh có biết bơi không?' Nhân viên: 'Không ạ.' Ông chủ: 'Thế sao anh không tập bơi đi, sắp đến kỳ nghỉ rồi mà.'", "Cực hài"));
        list.add(new ListItem("Truyện cười 13", "Cậu bé hỏi bố: 'Bố ơi, sao con chó của nhà mình không bao giờ đi học?' Bố trả lời: 'Vì nó đã học thuộc lòng rồi!'", "Cực hài"));
        list.add(new ListItem("Truyện cười 14", "Một người đàn ông cầm 2 tờ vé số và nói: 'Một trong hai tờ này sẽ làm tôi thành triệu phú!'", "Cực hài"));
        list.add(new ListItem("Truyện cười 15", "Nhân viên bán hàng hỏi: 'Anh có muốn mua bảo hiểm cho chiếc điện thoại mới không?' Khách hàng trả lời: 'Không cần, tôi đã mua bảo hiểm cho cái ví của tôi rồi!'", "Cực hài"));
        list.add(new ListItem("Truyện cười 16", "Giáo viên hỏi: 'Nếu có 10 quả táo mà bạn ăn mất 3 quả, bạn còn lại bao nhiêu quả?' Học sinh đáp: 'Thưa cô, con sẽ còn no ạ!'", "Cực hài"));
        list.add(new ListItem("Truyện cười 17", "Bác sĩ bảo bệnh nhân: 'Anh cần ăn kiêng, bỏ rượu và không được hút thuốc.' Bệnh nhân hỏi: 'Thế anh có còn sống vui vẻ không?' Bác sĩ: 'Có, nhưng tôi thì không đảm bảo!'", "Cực hài"));
        list.add(new ListItem("Truyện cười 18", "Người vợ nói với chồng: 'Anh yêu, em nghĩ chúng ta cần phải tiết kiệm hơn.' Chồng: 'Được rồi, từ nay em không cần mua quà sinh nhật cho anh nữa.'", "Cực hài"));
        list.add(new ListItem("Truyện cười 19", "Cậu bé hỏi bố: 'Bố ơi, sao mẹ lại hét khi giận dữ?' Bố trả lời: 'Vì bố không thể nghe thấy mẹ khi mẹ không hét, con trai à!'", "Cực hài"));
        list.add(new ListItem("Truyện cười 20", "Sếp bảo nhân viên: 'Nếu không làm việc chăm chỉ, cậu sẽ trở thành khách hàng của công ty!' Nhân viên đáp: 'Sếp nói chuẩn, thế là em được nghỉ hưu sớm!'", "Cực hài"));

        list.add(new ListItem("Truyện cười 21", "Cô gái hỏi: 'Anh có thích gái đẹp không?' Chàng trai: 'Anh chỉ thích em thôi.' Cô gái: 'Thế nghĩa là anh không nghĩ em đẹp sao?'", "Cười 18"));
        list.add(new ListItem("Truyện cười 22", "Hai vợ chồng mới cưới. Vợ nói: 'Anh ơi, anh có muốn thử một chút 'gia vị' trong hôn nhân không?' Chồng đáp: 'Em ơi, cho thêm nhiều gia vị vào luôn nhé!'", "Cười 18"));
        list.add(new ListItem("Truyện cười 23", "Trong buổi tiệc cưới, chú rể nói với cô dâu: 'Em là món quà tuyệt vời nhất mà anh nhận được. Nhưng anh vẫn chưa biết là có cần giấy bảo hành không?'", "Cười 18"));
        list.add(new ListItem("Truyện cười 24", "Người vợ thắc mắc: 'Sao anh lúc nào cũng nói yêu em nhiều hơn ngày hôm qua?' Chồng đáp: 'Vì hôm qua anh đã lỡ nói dối!'", "Cười 18"));
        list.add(new ListItem("Truyện cười 25", "Cô gái hỏi chàng trai: 'Anh có yêu em không?' Chàng trai đáp: 'Anh yêu em nhiều đến mức chỉ cần thấy em là anh quên hết đường về!'", "Cười 18"));
        list.add(new ListItem("Truyện cười 26", "Vợ hỏi chồng: 'Nếu em có ngoại tình, anh sẽ làm gì?' Chồng bình tĩnh: 'Anh sẽ không làm gì cả. Em cứ ngoại tình còn anh sẽ có thêm thời gian chơi game!'", "Cười 18"));
        list.add(new ListItem("Truyện cười 27", "Chàng trai nói với bạn gái: 'Em ơi, anh thích những cô gái dịu dàng nhưng lại mạnh mẽ trong tình cảm.' Cô gái đáp: 'Anh may mắn đấy, vì em mạnh cả hai thứ!'", "Cười 18"));
        list.add(new ListItem("Truyện cười 28", "Cô vợ bảo chồng: 'Anh ơi, nếu em đi xa, anh có nhớ em không?' Chồng cười: 'Không cần phải đi xa, em chỉ cần ra khỏi phòng anh đã nhớ rồi!'", "Cười 18"));
        list.add(new ListItem("Truyện cười 29", "Người đàn ông hỏi bác sĩ: 'Thưa bác sĩ, tại sao tôi lại không ngủ được?' Bác sĩ trả lời: 'Vì vợ anh luôn muốn anh tỉnh táo mỗi khi cô ấy nói chuyện.'", "Cười 18"));
        list.add(new ListItem("Truyện cười 30", "Cô gái hỏi: 'Anh có bao giờ nghĩ đến việc kết hôn chưa?' Chàng trai: 'Anh có nghĩ, nhưng chỉ là nghĩ đến em, còn kết hôn thì... để sau!'", "Cười 18"));

        list.add(new ListItem("Truyện cười 31", "Ngày xưa, ông già nọ dạy con: 'Con à, đừng lấy vợ đẹp quá, không thì con sẽ phải lo giữ suốt ngày!'", "Dân gian"));
        list.add(new ListItem("Truyện cười 32", "Một anh chàng đi câu cá. Người qua đường hỏi: 'Cá có cắn câu không?' Anh ta đáp: 'Cắn thì nhiều nhưng cá thì chưa!'", "Dân gian"));
        list.add(new ListItem("Truyện cười 33", "Bà vợ nói với ông chồng: 'Ông ơi, tôi thấy có người bảo rằng ông có tướng vượng phu.' Ông chồng đáp: 'Thế hả, thì ra là tướng tôi tốt mà!'", "Dân gian"));
        list.add(new ListItem("Truyện cười 34", "Ông lão bán bánh hỏi thầy bói: 'Sao tháng này bánh bán chậm quá?' Thầy bói đáp: 'Vì ông không xem ngày tốt để bán!'", "Dân gian"));
        list.add(new ListItem("Truyện cười 35", "Ngày xưa, có một người hỏi ông lão: 'Ông có biết con gì sống dai nhất không?' Ông lão đáp: 'Con khỉ, vì suốt ngày trèo cây không lo gì!'", "Dân gian"));
        list.add(new ListItem("Truyện cười 36", "Một hôm, có người hỏi: 'Sao anh lại cười to thế?' Anh đáp: 'Vì tôi mới kể một câu chuyện cười cho vợ tôi nghe và chính tôi thấy buồn cười!'", "Dân gian"));
        list.add(new ListItem("Truyện cười 37", "Bà già bảo cháu: 'Cháu ơi, sao hôm nay trông cháu buồn thế?' Cháu đáp: 'Vì cháu mới bị thua một trò chơi dân gian!'", "Dân gian"));
        list.add(new ListItem("Truyện cười 38", "Một anh nông dân nói: 'Ngày xưa tôi nghèo lắm, đến mức không có lấy một con gà để bán!' Nhưng bây giờ anh ta đã có... hai con gà!", "Dân gian"));
        list.add(new ListItem("Truyện cười 39", "Một anh chàng ngồi câu cá mãi không được con nào. Có người qua hỏi: 'Có bắt được con nào chưa?' Anh chàng đáp: 'Chưa, nhưng tôi đã học được sự kiên nhẫn!'", "Dân gian"));
        list.add(new ListItem("Truyện cười 40", "Có một ông lão kể chuyện ngày xưa: 'Tôi đã từng trèo đèo lội suối để đi hái củi, nhưng không ai tin vì giờ tôi chỉ muốn ngồi chơi thôi!'", "Dân gian"));

        list.add(new ListItem("Truyện cười 41", "Bố bảo con: 'Con hãy học giỏi để sau này làm bác sĩ nhé!' Con đáp: 'Con sẽ học để không cần phải đi bác sĩ!' ", "Gia đình"));
        list.add(new ListItem("Truyện cười 42", "Mẹ hỏi con trai: 'Con có thấy cái áo của mẹ đâu không?' Con đáp: 'Mẹ thử tìm trong máy giặt xem!'", "Gia đình"));
        list.add(new ListItem("Truyện cười 43", "Bố hỏi con: 'Con đã làm bài tập chưa?' Con trả lời: 'Con đã định làm rồi, nhưng con lại thấy mệt quá!'", "Gia đình"));
        list.add(new ListItem("Truyện cười 44", "Con hỏi bố: 'Bố ơi, tại sao con lại phải ăn rau?' Bố đáp: 'Vì bố muốn con khỏe mạnh để làm việc nhà giúp bố!'", "Gia đình"));
        list.add(new ListItem("Truyện cười 45", "Mẹ nói với con gái: 'Con hãy đi chợ giúp mẹ!' Con gái đáp: 'Mẹ đi một mình sẽ tiết kiệm được tiền hơn!'", "Gia đình"));
        list.add(new ListItem("Truyện cười 46", "Bố nói với mẹ: 'Em nấu cơm ngon quá, nhưng anh vẫn thích ăn ngoài hơn!' Mẹ đáp: 'Tốt, tối nay anh tự nấu nhé!'", "Gia đình"));
        list.add(new ListItem("Truyện cười 47", "Con trai hỏi mẹ: 'Mẹ ơi, sao bố hay gọi mẹ là nữ hoàng?' Mẹ đáp: 'Vì mẹ có quyền ra lệnh trong nhà này!' ", "Gia đình"));
        list.add(new ListItem("Truyện cười 48", "Con gái hỏi mẹ: 'Mẹ ơi, sao bố hay ngồi xem TV thế?' Mẹ đáp: 'Bố con là vua lười đấy!'", "Gia đình"));
        list.add(new ListItem("Truyện cười 49", "Mẹ dặn con: 'Đừng quên mang ô đi học nhé!' Con trả lời: 'Con sẽ mang nếu trời không mưa!'", "Gia đình"));
        list.add(new ListItem("Truyện cười 50", "Con trai nói: 'Bố ơi, con muốn nuôi một con chó!' Bố đáp: 'Được thôi, nhưng chỉ khi con làm việc nhà cho con chó đó!'", "Gia đình"));

        list.add(new ListItem("Truyện cười 51", "Cảnh sát hỏi tài xế: 'Anh có biết mình đã chạy quá tốc độ không?' Tài xế trả lời: 'Vâng, nhưng tôi chỉ muốn thử xem xe của tôi chạy nhanh đến đâu!'", "Giao thông"));
        list.add(new ListItem("Truyện cười 52", "Tài xế hỏi cảnh sát: 'Tôi bị phạt bao nhiêu nếu vượt đèn đỏ?' Cảnh sát đáp: 'Không biết, nhưng nếu anh vượt thì sẽ biết ngay!'", "Giao thông"));
        list.add(new ListItem("Truyện cười 53", "Một người đi bộ hỏi: 'Đèn giao thông bị hỏng thì làm sao tôi biết khi nào được qua đường?' Người khác đáp: 'Khi tất cả các xe đều dừng lại!',", "Giao thông"));
        list.add(new ListItem("Truyện cười 54", "Một tài xế đi ngược chiều, cảnh sát chặn lại hỏi: 'Sao anh đi ngược chiều?' Tài xế đáp: 'Tôi nghĩ tất cả mọi người đang đi sai hướng!'", "Giao thông"));
        list.add(new ListItem("Truyện cười 55", "Người đi đường hỏi cảnh sát: 'Tại sao anh lại đuổi theo tôi?' Cảnh sát đáp: 'Vì tôi không có xe để đuổi theo người khác!'", "Giao thông"));
        list.add(new ListItem("Truyện cười 56", "Cảnh sát dừng một chiếc xe: 'Anh biết mình vừa vượt đèn đỏ không?' Tài xế đáp: 'Tôi không thấy, tôi chỉ thấy màu xanh thôi!'", "Giao thông"));
        list.add(new ListItem("Truyện cười 57", "Tài xế thắc mắc: 'Anh dừng tôi lại vì cái gì?' Cảnh sát đáp: 'Vì tôi không có gì làm cả!'", "Giao thông"));
        list.add(new ListItem("Truyện cười 58", "Người đi bộ hỏi cảnh sát giao thông: 'Tôi có thể qua đường được không?' Cảnh sát đáp: 'Được, nhưng tôi không đảm bảo an toàn đâu!'", "Giao thông"));
        list.add(new ListItem("Truyện cười 59", "Cảnh sát nói với người lái xe: 'Anh vừa chạy quá tốc độ!' Người lái xe đáp: 'Không, tôi chỉ đang cố đi cùng tốc độ với đèn đỏ!'", "Giao thông"));
        list.add(new ListItem("Truyện cười 60", "Tài xế nói: 'Tôi không sợ bị phạt, vì tôi không có tiền!' Cảnh sát đáp: 'Thế thì anh sẽ phải ở lại đây!' ", "Giao thông"));

        list.add(new ListItem("Truyện cười 61", "Thầy giáo hỏi: 'Tại sao em lại đi học muộn?' Học sinh đáp: 'Thưa thầy, vì em đi chậm!'", "Học sinh"));
        list.add(new ListItem("Truyện cười 62", "Cô giáo hỏi: 'Ai là người viết Đoạn trường tân thanh?' Học sinh đáp: 'Không phải em!'", "Học sinh"));
        list.add(new ListItem("Truyện cười 63", "Thầy giáo: 'Em hãy giải thích câu này.' Học sinh: 'Thưa thầy, em không thể giải thích được vì em chưa hiểu!' ", "Học sinh"));
        list.add(new ListItem("Truyện cười 64", "Giờ kiểm tra, cô giáo hỏi: 'Em chép bài của bạn à?' Học sinh trả lời: 'Không cô, chúng em chỉ cùng có đáp án giống nhau thôi!'", "Học sinh"));
        list.add(new ListItem("Truyện cười 65", "Cô giáo: 'Tại sao em không làm bài tập về nhà?' Học sinh: 'Vì nhà em mất điện, mà bài tập lại yêu cầu dùng đèn!' ", "Học sinh"));
        list.add(new ListItem("Truyện cười 66", "Học sinh: 'Thưa thầy, em làm bài tập cả tối qua!' Thầy giáo: 'Nhưng bài tập có nộp đâu!' Học sinh: 'Dạ, em chỉ mơ thôi ạ!'", "Học sinh"));
        list.add(new ListItem("Truyện cười 67", "Thầy giáo hỏi: 'Ai vẽ hình tròn lên bảng vậy?' Học sinh đáp: 'Thưa thầy, em nghĩ nó là hình vuông!'", "Học sinh"));
        list.add(new ListItem("Truyện cười 68", "Cô giáo hỏi: 'Tại sao em không làm bài kiểm tra?' Học sinh đáp: 'Vì em không có cảm hứng để suy nghĩ!'", "Học sinh"));
        list.add(new ListItem("Truyện cười 69", "Thầy giáo: 'Tại sao em lại ngủ trong lớp?' Học sinh: 'Thưa thầy, em chỉ đang tạm nghỉ để tiếp thu kiến thức thôi ạ!'", "Học sinh"));
        list.add(new ListItem("Truyện cười 70", "Học sinh hỏi: 'Thưa thầy, có cách nào để qua môn không?' Thầy giáo đáp: 'Chỉ có phép màu mới giúp em thôi!'", "Học sinh"));

    }



    @Override
    public void iOnClickItem2(String ten, String noidung) {
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("ten",ten);
        intent.putExtra("noidung",noidung);
        startActivity(intent);
    }
}