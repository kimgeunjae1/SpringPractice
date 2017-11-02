package com.naver.rmswo.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Profiler {
	
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable { //Ư�� Joinpoint���� ����� ���� ����� trace()�޼ҵ� ����
			String signatureString = joinPoint.getSignature().toShortString();
			System.out.println(signatureString + " ����");
			long start = System.currentTimeMillis();
			try {
				Object result = joinPoint.proceed();	//Advice�� ����� ��� ��ü�� ȣ���ϱ� ���� �Ŀ� �ð��� ����
				return result;							
			} finally {
				long finish = System.currentTimeMillis();
				System.out.println(signatureString + " ����");
				System.out.println(signatureString + " ���� �ð� : " + (finish - start) + "ms");//���ؼ� ��� ��ü�� �޼ҵ� ȣ�� ����ð��� ���
				
			}
		}
}
