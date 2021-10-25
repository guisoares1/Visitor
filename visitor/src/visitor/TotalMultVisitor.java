package visitor;

import java.util.List;

public class TotalMultVisitor implements NumberVisitor{
	int total=0;
	@Override
	public void visit(TwoElement twoElement) {
		int sum = twoElement.a * twoElement.b;
		System.out.printf(twoElement.a + "+" + twoElement.b + " = " + sum);
		total+=sum;
	}

	@Override
	public void visit(ThreeElement threeElement) {
		int sum = threeElement.a * threeElement.b * threeElement.c;
		System.out.printf(threeElement.a + "*" + threeElement.b + "*" + threeElement.c + " = " + sum);
		total+=sum;
	}

	@Override
	public void visit(List<NumberElement> elementList) {
		for (NumberElement ne : elementList) 
		{
			ne.accept(this);
		}
	}
	
	public int getTotalMul()
	{
		return total;
	}
}
