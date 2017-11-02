package com.naver.rmswo.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Profiler {
	
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable { //특정 Joinpoint에서 실행될 공통 기능인 trace()메소드 구현
			String signatureString = joinPoint.getSignature().toShortString();
			System.out.println(signatureString + " 시작");
			long start = System.currentTimeMillis();
			try {
				Object result = joinPoint.proceed();	//Advice가 적용될 대상 객체를 호출하기 전과 후에 시간을 구함
				return result;							
			} finally {
				long finish = System.currentTimeMillis();
				System.out.println(signatureString + " 종료");
				System.out.println(signatureString + " 실행 시간 : " + (finish - start) + "ms");//구해서 대상 객체의 메소드 호출 실행시간을 출력
				
			}
		}
}
