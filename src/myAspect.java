import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class myAspect{
	
	ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	
    @Pointcut("execution (* BinaryTree.lookUp(..))")
    private void lookup(){
    }
    
    @Pointcut("execution (* BinaryTree.insert(..))")
    private void insertNode(){}
    
    @Pointcut("execution (* BinaryTree.delete(..))")
    private void deleteNode(){}
    
    @Around("insertNode()")
    public void insertAdvice(ProceedingJoinPoint pjp) throws Throwable {
    	readWriteLock.writeLock().lock();
    	System.out.println("Insertig start ||thread: "+Thread.currentThread().getName());
    	pjp.proceed();
        System.out.println("Value end ||thread: "+Thread.currentThread().getName());
    	readWriteLock.writeLock().unlock();	
    }
    
    @Around("deleteNode()")
    public void deleteAdvice(ProceedingJoinPoint pjp) throws Throwable {
    	readWriteLock.writeLock().lock();
    	System.out.println("delete start ||thread: "+Thread.currentThread().getName());
    	pjp.proceed();
        System.out.println("delete end ||thread: "+Thread.currentThread().getName());
    	readWriteLock.writeLock().unlock();	    
    	}
    
    @Around("lookup()")
    public void lookUpAdvice(ProceedingJoinPoint pjp) throws Throwable {
    	readWriteLock.readLock().lock();
    	System.out.println("lookUp start ||thread: "+Thread.currentThread().getName());
    	pjp.proceed();    	
    	System.out.println("lookUp end ||thread: "+Thread.currentThread().getName());
    	readWriteLock.readLock().unlock();	    
    	}
    
}