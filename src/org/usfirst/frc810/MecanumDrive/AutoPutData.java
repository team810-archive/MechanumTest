package org.usfirst.frc810.MecanumDrive;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AutoPutData {

	private static ScheduledThreadPoolExecutor executor= new ScheduledThreadPoolExecutor(1);
	
	private static List<SupplierPair<Double>> numbers = new CopyOnWriteArrayList<>();
	
	static{
		executor.scheduleWithFixedDelay(()->{
			numbers.forEach(a->{
				SmartDashboard.putNumber(a.name, a.supplier.get());
			});
		}, 0, 50, TimeUnit.MILLISECONDS);
	}
	
	
	
	private static class SupplierPair<K>{
		String name;
		Supplier<K> supplier;
	}
	
	public static void addNumber(String name, Supplier<Number> number){
		SupplierPair<Double> sp = new SupplierPair<>();
		sp.name = name;
		sp.supplier = ()->(number.get().doubleValue());
		numbers.add(sp);
	}
}
