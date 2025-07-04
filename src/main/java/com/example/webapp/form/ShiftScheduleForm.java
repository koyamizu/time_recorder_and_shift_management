package com.example.webapp.form;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShiftScheduleForm {

//	シフトID
	@NotNull(message="出勤日を選択してください")
	private Integer shiftId;
//	出勤予定日
	private LocalDate date;
}
