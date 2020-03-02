package com.psp.manageschool;

import java.util.ArrayList;

public class ManageSchoolMain implements ManageSchool {

	SubjectRequest subjectRequest = new SubjectRequest();
	SubjectResponse subjectResponse = new SubjectResponse();
	StudentRequest studentRequest = new StudentRequest();
	StudentResponse studentResponse = new StudentResponse();
	ScoringRequest scoringRequest = new ScoringRequest();
	ScoringResponse scoringResponse = new ScoringResponse();
	ArrayList<SubjectRequest> SubjectList = new ArrayList<SubjectRequest>();
	ArrayList<StudentRequest> StudentList = new ArrayList<StudentRequest>();
	ArrayList<ScoringRequest> ScoreList = new ArrayList<ScoringRequest>();

	@Override
	public SubjectResponse manageSubject(SubjectRequest objSubject) {

		subjectRequest.setName(objSubject.getName());
		subjectRequest.setId(objSubject.getId());
		if (subjectRequest.getName().isEmpty() || subjectRequest.getId() == 0) {
			subjectResponse.setValidation(false);
			return subjectResponse;
		} else {
			subjectResponse.setValidation(true);
			SubjectList.add(subjectRequest);
			return subjectResponse;
		}
	}

	@Override
	public ScoringResponse manageScoring(ScoringRequest objScoring) {

		for (StudentRequest stu : StudentList) {
			if (stu.getName().equals(objScoring.getStudent())) {
				scoringRequest.setStudent(objScoring.getStudent());
			}
		}

		for (SubjectRequest sub : SubjectList) {
			if (sub.getName().equals(objScoring.getSubject())) {
				scoringRequest.setSubject(objScoring.getSubject());
			}
		}

		scoringRequest.setScore(objScoring.getScore());

		if (scoringRequest.getStudent().isEmpty() || scoringRequest.getSubject().isEmpty()) {
			scoringResponse.setValidation(false);
			return scoringResponse;

		} else {
			scoringResponse.setValidation(true);
			return scoringResponse;
		}
	}

	@Override
	public StudentResponse manageStudent(StudentRequest objStudent) {
		studentRequest.setName(objStudent.getName());
		studentRequest.setDni(objStudent.getDni());
		studentRequest.setAddress(objStudent.getAddress());
		if (studentRequest.getName().isEmpty() || studentRequest.getDni().isEmpty()
				|| studentRequest.getAddress().isEmpty()) {
			studentResponse.setValidation(false);
			return studentResponse;
		} else {
			studentResponse.setValidation(true);
			StudentList.add(studentRequest);
			return studentResponse;
		}
	}

}
