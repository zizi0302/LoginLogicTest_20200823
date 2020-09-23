package kr.co.loginlogictest_20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        로그인 버튼이 눌렸을 때
        loginBtn.setOnClickListener {

//        아이디 / 비번에 뭐라고 적혀있는지 각각 변수로 저장
            val inputId = idEdt.text.toString()
            val inputPw = pwEdt.text.toString()

//        아이디 : admin@test.com AND 비번 : qwer 질문(검사)
            if (inputId == "admin@test.com" && inputPw == "qwer") {
//        아이디 / 비번 둘다 정확히 입력한 경우
                Toast.makeText(this, "관리자 로그인 입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
//                둘중 하나라도 틀리면 들어오는 분기
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }
    }
}