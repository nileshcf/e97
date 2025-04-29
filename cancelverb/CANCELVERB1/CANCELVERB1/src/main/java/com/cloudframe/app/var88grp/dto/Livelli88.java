package com.cloudframe.app.var88grp.dto;

/**
*  The class Livelli88 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:40. using version 5.0.0.254
**/


import com.cloudframe.app.var88grp.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Livelli88 extends Livelli88Serialized {
   

								private int swCurvaChild;
	
	/**
	* Constructor for Livelli88
	**/
    public Livelli88() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSwCurvaChild(0);
    }


 

	/**
	 *	Returns the value of swCurvaChild
	 *	@return swCurvaChild
	 */
	public int getSwCurvaChild() throws CFException {
       if (isSwCurvaChildModified()) { 
           swCurvaChild = refreshSwCurvaChild();
        }
   		return swCurvaChild;
	}
	

	
	   
	/**
	 * 	Update SwCurvaChild with the passed value
	 *  Corresponding COBOL Variable is SW-CURVA-CHILD
	 *	@param number
	 */
	public void setSwCurvaChild(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    swCurvaChild = checkSwCurvaChildMaxLimit(number); 
		serializeSwCurvaChild(swCurvaChild);
	}
	

	public void setSwCurvaChild(long number) {
	    number = checkSwCurvaChildMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSwCurvaChild((int)number);
	}
	
	/**
	 * 	Update SwCurvaChild with the passed value
	 *	@param value (String or char[])
	 */
	public void setSwCurvaChild(char[] value) throws CFException {
		 swCurvaChild = serializeSwCurvaChild(value);
	}
	/**
	 * 	Update SwCurvaChild with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSwCurvaChildString(char[] value) throws CFException {
		 setSwCurvaChild(value);
	}
	
	/**
	 *	Test condition 3 for isChild1()
	 *	@return  Returns true if isChild1() is 3
	 */
   public boolean isChild1() throws CFException {
      return (  getSwCurvaChild()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setChild1True() {  			
    	setSwCurvaChild( 3);
   	}
	
	/**
	 *	Test condition 4 for isChild2()
	 *	@return  Returns true if isChild2() is 4
	 */
   public boolean isChild2() throws CFException {
      return (  getSwCurvaChild()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setChild2True() {  			
    	setSwCurvaChild( 4);
   	}
	
	/**
	 *	Test condition 5 6 7 for isChildAll()
	 *	@return  Returns true if isChildAll() is 5 6 7
	 */
   public boolean isChildAll() throws CFException {
      return (  getSwCurvaChild()  ==  5  ||  getSwCurvaChild()  ==  6  ||  getSwCurvaChild()  ==  7  );
   }


	/**
	*  set values 5 6 7
	*/
   	public void setChildAllTrue() {  			
    	setSwCurvaChild( 5);
   	}

	
	
	

		public static int getLivelli88FieldLength() {
			return LIVELLI_88_LENGTH;
		}

}
  
