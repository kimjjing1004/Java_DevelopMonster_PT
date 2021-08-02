package this_is_java.chap11;

import java.util.Comparator;

import this_is_java.chap11.CompareExample.Student;

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		if (a.sno < b.sno)
			return -1;
		else if (a.sno == b.sno)	// 간단하게 다음 코드로 대체할 수 있다.
			return 0;				// return Integer.compare(a.sno, b.sno);
		else  return 1;
	}
	
}
