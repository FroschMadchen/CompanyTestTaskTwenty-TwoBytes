package com.example.task22byte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ItemQuestion> questions = new ArrayList<>();
        questions.add(new ItemQuestion("Вопрос 1", "Ответ 1.1",
                "Ответ 1.2", "Ответ 1.3", "Ответ 1.4",
                2)); // Последний аргумент - индекс правильного ответа
        questions.add(new ItemQuestion("Вопрос 2",
                "Ответ 2.1", "Ответ 2.2", "Ответ 2.3", "Ответ 2.4",
                1));

       /* Button nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Проверяем, выбран ли правильный ответ
                int selectedAnswerIndex = radioGroup.getCheckedRadioButtonId();
                boolean isCorrect = selectedAnswerIndex == currentQuestion.getCorrectAnswerIndex();

                // Обновляем результаты (например, считаем правильные ответы)
                if (isCorrect) {
                    // Увеличьте счетчик правильных ответов
                }

                // Переходим к следующему вопросу (если есть)
                if (currentIndex < questions.size() - 1) {
                    currentIndex++;
                    currentQuestion = questions.get(currentIndex);
                    updateUIWithNewQuestion();
                } else {
                    // Если это последний вопрос, завершаем опрос или делаем что-то еще
                    // Например, показываем результаты
                }
            }
        });
    }*/
    }
}