package com.rocketseat.certification_nlw.modules.students.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionAnswersDTO {

    private UUID questionID;
    private UUID alternativeID;
    private boolean isCorrect;
}
