package net.big_oh.resourcestats.domain;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import net.big_oh.hibernate.HibernateVO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/*
 Copyright (c) 2009 Dave Wingate dba Big-Oh Software (www.big-oh.net)

 Permission is hereby granted, free of charge, to any person
 obtaining a copy of this software and associated documentation
 files (the "Software"), to deal in the Software without
 restriction, including without limitation the rights to use,
 copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the
 Software is furnished to do so, subject to the following
 conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 OTHER DEALINGS IN THE SOFTWARE.
 */

/**
 * An abstract base class for testing Hibernate domain objects.
 * 
 * @author davewingate
 * @version Sep 9, 2009
 * @param <T>
 *            The type of the domain object being tested
 */
public abstract class DomainObjectTestBase<T extends HibernateVO>
{
	protected T domainObjectToTest = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		domainObjectToTest = buildDomainObjectToTest();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	protected abstract T buildDomainObjectToTest();

	public T getDomainObjectToTest()
	{
		return domainObjectToTest;
	}

	/**
	 * Test method for getBusinessKeys().
	 */
	@Test
	public void testGetBusinessKeys()
	{
		assertNotNull(domainObjectToTest.getBusinessKeys());
		assertTrue(domainObjectToTest.getBusinessKeys().length > 0);
	}

}
