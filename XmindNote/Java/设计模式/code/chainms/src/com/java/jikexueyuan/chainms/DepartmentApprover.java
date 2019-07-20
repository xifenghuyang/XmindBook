package com.java.jikexueyuan.chainms;

/**
 * 部长处理类
 */
public class DepartmentApprover extends Approver {

	public DepartmentApprover(String Name) {
		super(Name + " DepartmentLeader");
	}

	@Override
	public void ProcessRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
        // 大于5000，小于10000.部长处理，避免耦合，添加大于5000
		if ((5000 <= request.GetSum()) && (request.GetSum() < 10000)) {
			System.out.println("**This request " + request.GetID()
					+ " will be handled by " + this.Name + " **");
		} else {
			successor.ProcessRequest(request);
		}

	}

}
