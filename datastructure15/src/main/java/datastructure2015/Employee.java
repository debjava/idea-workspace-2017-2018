package datastructure2015;

import java.util.Arrays;

public class Employee {
	
	private String stringVal;
	private byte byteVal;
	private short shortVal;
	private int intVal;
	private float floatVal;
	private double doubleVal;
	private long longVal;
	private EmpType enumType; // Permanent or Temporary
	private char ch;
	private byte[] byteArrVal;
	private String[] strArrVal;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Employee employee = (Employee) o;

		if (byteVal != employee.byteVal) return false;
		if (shortVal != employee.shortVal) return false;
		if (intVal != employee.intVal) return false;
		if (Float.compare(employee.floatVal, floatVal) != 0) return false;
		if (Double.compare(employee.doubleVal, doubleVal) != 0) return false;
		if (longVal != employee.longVal) return false;
		if (ch != employee.ch) return false;
		if (stringVal != null ? !stringVal.equals(employee.stringVal) : employee.stringVal != null) return false;
		if (enumType != employee.enumType) return false;
		if (!Arrays.equals(byteArrVal, employee.byteArrVal)) return false;
		// Probably incorrect - comparing Object[] arrays with Arrays.equals
		return Arrays.equals(strArrVal, employee.strArrVal);

	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = stringVal != null ? stringVal.hashCode() : 0;
		result = 31 * result + (int) byteVal;
		result = 31 * result + (int) shortVal;
		result = 31 * result + intVal;
		result = 31 * result + (floatVal != +0.0f ? Float.floatToIntBits(floatVal) : 0);
		temp = Double.doubleToLongBits(doubleVal);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + (int) (longVal ^ (longVal >>> 32));
		result = 31 * result + (enumType != null ? enumType.hashCode() : 0);
		result = 31 * result + (int) ch;
		result = 31 * result + (byteArrVal != null ? Arrays.hashCode(byteArrVal) : 0);
		result = 31 * result + (strArrVal != null ? Arrays.hashCode(strArrVal) : 0);
		return result;
	}
}
