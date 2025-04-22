package com.cloudframe.app.ar640010.dto;

/**
*  The class ProcDate810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ProcDate810 extends ProcDate810Serialized { 
   

								private int procYear810;

						private char[] procDlm1810 = new char[1];

								private int procMonth810;

						private char[] procDlm2810 = new char[1];

								private int procDay810;
	
	/**
	* Constructor for ProcDate810
	**/
    public ProcDate810() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ProcDate810. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProcDate810(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setProcYear810(0);
								setProcDlm1810(fillSpace(1));
								setProcMonth810(0);
								setProcDlm2810(fillSpace(1));
								setProcDay810(0);
    } 

	/**
	 *	Returns the value of procYear810
	 *	@return procYear810
	 */
	public int getProcYear810() throws CFException {
       if (isProcYear810Modified()) { 
           procYear810 = refreshProcYear810();
        }
   		return procYear810;
	}
	

	
	   
	/**
	 * 	Update ProcYear810 with the passed value
	 *  Corresponding COBOL Variable is 810-PROC-YEAR
	 *	@param number
	 */
	public void setProcYear810(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    procYear810 = checkProcYear810MaxLimit(number); 
		serializeProcYear810(procYear810);
	}
	

	public void setProcYear810(long number) {
	    number = checkProcYear810MaxLimit(number); // Truncate if value is beyond +/- Max range
		setProcYear810((int)number);
	}
	
	/**
	 * 	Update ProcYear810 with the passed value
	 *	@param value (String or char[])
	 */
	public void setProcYear810(char[] value) throws CFException {
		 procYear810 = serializeProcYear810(value);
	}
	/**
	 * 	Update ProcYear810 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setProcYear810String(char[] value) throws CFException {
		 setProcYear810(value);
	}
	
	/**
	 *	Test condition 2000 THRU 2199 for isProcYearValid88810()
	 *	@return  Returns true if isProcYearValid88810() is 2000 THRU 2199
	 */
   public boolean isProcYearValid88810() throws CFException {
      return (   (getProcYear810()  >=  2000 ) &&   (getProcYear810()  <=  2199 )   );
   }


	/**
	*  set values 2000 THRU 2199
	*/
   	public void setProcYearValid88810True() {  			
    	setProcYear810( 2000);
   	}
	/**
	 *	Returns the value of procDlm1810
	 *	@return procDlm1810
	 */
   public char[] getProcDlm1810() throws CFException{
     if (isProcDlm1810Modified()) { 
        procDlm1810 = refreshProcDlm1810();
     }
   		return procDlm1810;
   }

  
	/**
	*  set variable procDlm1810
	*  Corresponding COBOL Variable is 810-PROC-DLM1
	*  @param value
	**/
   public void setProcDlm1810(char[] value) {
      procDlm1810 = checkProcDlm1810Constraints(value);
      serializeProcDlm1810(procDlm1810);
   } 

     /**
	 * 	Update ProcDlm1810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProcDlm1810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProcDlm1810,procDlm1810.length);
   	
   }
   
   public void setProcDlm1810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProcDlm1810,procDlm1810.length);
   	
   }
   
     /**
	 * 	Update ProcDlm1810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcDlm1810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDlm1810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProcDlm1810 with another Field
	 *	@param value
	 */
   public void setProcDlm1810(Field source) {
       replace(source,0,source.length(),beginProcDlm1810,PROC_DLM_1810_LEN);
   	
   }  
   
     /**
	 * 	Update ProcDlm1810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProcDlm1810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProcDlm1810,PROC_DLM_1810_LEN);
   	
   }
   
     /**
	 * 	Update ProcDlm1810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcDlm1810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDlm1810+targetIndex,targetLen);
    
   }
	char[] procDlm1Valid8881088Value1 = "-".toCharArray();
char[] procDlm1Valid8881088Value2 = "/".toCharArray();
char[] procDlm1Valid8881088Value3 = ".".toCharArray();

	/**
	 *	Test condition "-" "/" "." for isProcDlm1Valid88810()
	 *	@return  Returns true if isProcDlm1Valid88810() is "-" "/" "."
	 */
   public boolean isProcDlm1Valid88810() throws CFException {
      return (  compareChars( getProcDlm1810() , procDlm1Valid8881088Value1)  == 0  ||  compareChars( getProcDlm1810() , procDlm1Valid8881088Value2)  == 0  ||  compareChars( getProcDlm1810() , procDlm1Valid8881088Value3)  == 0  );
   }


	/**
	*  set values "-" "/" "."
	*/
   	public void setProcDlm1Valid88810True() {  			
    	setProcDlm1810( procDlm1Valid8881088Value1);
   	}
	char[] procDlm1Std8881088Value = "-".toCharArray();
	/**
	 *	Test condition "-" for isProcDlm1Std88810()
	 *	@return  Returns true if isProcDlm1Std88810() is "-"
	 */
   public boolean isProcDlm1Std88810() throws CFException {
      return (  compareChars( getProcDlm1810() , procDlm1Std8881088Value)  == 0  );
   }


	/**
	*  set values "-"
	*/
   	public void setProcDlm1Std88810True() {  			
    	setProcDlm1810( procDlm1Std8881088Value);
   	}
	/**
	 *	Returns the value of procMonth810
	 *	@return procMonth810
	 */
	public int getProcMonth810() throws CFException {
       if (isProcMonth810Modified()) { 
           procMonth810 = refreshProcMonth810();
        }
   		return procMonth810;
	}
	

	
	   
	/**
	 * 	Update ProcMonth810 with the passed value
	 *  Corresponding COBOL Variable is 810-PROC-MONTH
	 *	@param number
	 */
	public void setProcMonth810(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    procMonth810 = checkProcMonth810MaxLimit(number); 
		serializeProcMonth810(procMonth810);
	}
	

	public void setProcMonth810(long number) {
	    number = checkProcMonth810MaxLimit(number); // Truncate if value is beyond +/- Max range
		setProcMonth810((int)number);
	}
	
	/**
	 * 	Update ProcMonth810 with the passed value
	 *	@param value (String or char[])
	 */
	public void setProcMonth810(char[] value) throws CFException {
		 procMonth810 = serializeProcMonth810(value);
	}
	/**
	 * 	Update ProcMonth810 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setProcMonth810String(char[] value) throws CFException {
		 setProcMonth810(value);
	}
	
	/**
	 *	Test condition 1 THRU 12 for isProcMonthValid88810()
	 *	@return  Returns true if isProcMonthValid88810() is 1 THRU 12
	 */
   public boolean isProcMonthValid88810() throws CFException {
      return (   (getProcMonth810()  >=  1 ) &&   (getProcMonth810()  <=  12 )   );
   }


	/**
	*  set values 1 THRU 12
	*/
   	public void setProcMonthValid88810True() {  			
    	setProcMonth810( 1);
   	}
	/**
	 *	Returns the value of procDlm2810
	 *	@return procDlm2810
	 */
   public char[] getProcDlm2810() throws CFException{
     if (isProcDlm2810Modified()) { 
        procDlm2810 = refreshProcDlm2810();
     }
   		return procDlm2810;
   }

  
	/**
	*  set variable procDlm2810
	*  Corresponding COBOL Variable is 810-PROC-DLM2
	*  @param value
	**/
   public void setProcDlm2810(char[] value) {
      procDlm2810 = checkProcDlm2810Constraints(value);
      serializeProcDlm2810(procDlm2810);
   } 

     /**
	 * 	Update ProcDlm2810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProcDlm2810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProcDlm2810,procDlm2810.length);
   	
   }
   
   public void setProcDlm2810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProcDlm2810,procDlm2810.length);
   	
   }
   
     /**
	 * 	Update ProcDlm2810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcDlm2810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDlm2810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProcDlm2810 with another Field
	 *	@param value
	 */
   public void setProcDlm2810(Field source) {
       replace(source,0,source.length(),beginProcDlm2810,PROC_DLM_2810_LEN);
   	
   }  
   
     /**
	 * 	Update ProcDlm2810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProcDlm2810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProcDlm2810,PROC_DLM_2810_LEN);
   	
   }
   
     /**
	 * 	Update ProcDlm2810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcDlm2810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDlm2810+targetIndex,targetLen);
    
   }
	char[] procDlm2Valid8881088Value1 = "-".toCharArray();
char[] procDlm2Valid8881088Value2 = "/".toCharArray();
char[] procDlm2Valid8881088Value3 = ".".toCharArray();

	/**
	 *	Test condition "-" "/" "." for isProcDlm2Valid88810()
	 *	@return  Returns true if isProcDlm2Valid88810() is "-" "/" "."
	 */
   public boolean isProcDlm2Valid88810() throws CFException {
      return (  compareChars( getProcDlm2810() , procDlm2Valid8881088Value1)  == 0  ||  compareChars( getProcDlm2810() , procDlm2Valid8881088Value2)  == 0  ||  compareChars( getProcDlm2810() , procDlm2Valid8881088Value3)  == 0  );
   }


	/**
	*  set values "-" "/" "."
	*/
   	public void setProcDlm2Valid88810True() {  			
    	setProcDlm2810( procDlm2Valid8881088Value1);
   	}
	char[] procDlm2Std8881088Value = "-".toCharArray();
	/**
	 *	Test condition "-" for isProcDlm2Std88810()
	 *	@return  Returns true if isProcDlm2Std88810() is "-"
	 */
   public boolean isProcDlm2Std88810() throws CFException {
      return (  compareChars( getProcDlm2810() , procDlm2Std8881088Value)  == 0  );
   }


	/**
	*  set values "-"
	*/
   	public void setProcDlm2Std88810True() {  			
    	setProcDlm2810( procDlm2Std8881088Value);
   	}
	/**
	 *	Returns the value of procDay810
	 *	@return procDay810
	 */
	public int getProcDay810() throws CFException {
       if (isProcDay810Modified()) { 
           procDay810 = refreshProcDay810();
        }
   		return procDay810;
	}
	

	
	   
	/**
	 * 	Update ProcDay810 with the passed value
	 *  Corresponding COBOL Variable is 810-PROC-DAY
	 *	@param number
	 */
	public void setProcDay810(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    procDay810 = checkProcDay810MaxLimit(number); 
		serializeProcDay810(procDay810);
	}
	

	public void setProcDay810(long number) {
	    number = checkProcDay810MaxLimit(number); // Truncate if value is beyond +/- Max range
		setProcDay810((int)number);
	}
	
	/**
	 * 	Update ProcDay810 with the passed value
	 *	@param value (String or char[])
	 */
	public void setProcDay810(char[] value) throws CFException {
		 procDay810 = serializeProcDay810(value);
	}
	/**
	 * 	Update ProcDay810 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setProcDay810String(char[] value) throws CFException {
		 setProcDay810(value);
	}
	
	/**
	 *	Test condition 1 THRU 31 for isProcDayValid88810()
	 *	@return  Returns true if isProcDayValid88810() is 1 THRU 31
	 */
   public boolean isProcDayValid88810() throws CFException {
      return (   (getProcDay810()  >=  1 ) &&   (getProcDay810()  <=  31 )   );
   }


	/**
	*  set values 1 THRU 31
	*/
   	public void setProcDayValid88810True() {  			
    	setProcDay810( 1);
   	}

	
	
	

		public static int getProcDate810FieldLength() {
			return PROC_DATE_810_LENGTH;
		}

}
  
