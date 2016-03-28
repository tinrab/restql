import com.moybl.restql.*;
import com.moybl.restql.ast.*;

import org.junit.*;

public class ParserTest {

	@Test
	public void test() {
		AstNode result = RestQL.parse("print('hi')&life=!42&x=1!:2");

		result.accept(new DumpVisitor());
	}

}
