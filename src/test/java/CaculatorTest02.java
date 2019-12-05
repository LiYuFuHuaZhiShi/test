import org.junit.*;
import junit.framework.Assert;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xpf.config.SpringConfig;
import com.xpf.util.Caculator;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfig.class)
public class CaculatorTest02 {
	@Autowired
	private Caculator caculator;

	@Test
	public void testAdd() {
		// ��һ��������ֵ���ڶ���ִ�н���������������(��Ϊ double ���ͼ������һ�����)
		Assert.assertEquals(0.06, caculator.add(0.05, 0.01), 0.1);
	}

	@Test
	public void testSub() {
		Assert.assertEquals(0.4, caculator.sub(0.5, 0.1), 0.1);
	}

	@Test
	public void testMultiply() {
		Assert.assertEquals(0.05, caculator.multiply(0.5, 0.1), 0.1);
	}

	@Test
	public void testDiv() {
		Assert.assertEquals(5, caculator.div(0.5, 0.1), 0.1);
	}
}
