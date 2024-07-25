package com.coursemanager.exception;

public class StudentException extends RuntimeException {
	 public static enum ExceptionCode{
		 STUDENT_NOT_FOUND_EXCEPTION
	 }
	 
	 private ExceptionCode exceptionCode;
	 
	 public StudentException(String message) {
	        super(message);
	 }
	 
	 public StudentException(String message, ExceptionCode code) {
	        super(message);
	        this.exceptionCode = code;
	 }
	 
	 public String toString() {
		 return exceptionCode.toString()  + ": " + super.getLocalizedMessage();
	 }
}
