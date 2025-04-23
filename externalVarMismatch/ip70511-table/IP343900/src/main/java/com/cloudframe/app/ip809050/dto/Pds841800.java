package com.cloudframe.app.ip809050.dto;

/**
*  The class Pds841800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Pds841800 extends Pds841800Serialized { 
   

						private char[] pds841S1800 = Field.fillLowValue(4);
	
	/**
	* Constructor for Pds841800
	**/
    public Pds841800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Pds841800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pds841800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of pds841S1800
	 *	@return pds841S1800
	 */
   public char[] getPds841S1800() throws CFException{
     if (isPds841S1800Modified()) { 
        pds841S1800 = refreshPds841S1800();
     }
   		return pds841S1800;
   }

  
	/**
	*  set variable pds841S1800
	*  Corresponding COBOL Variable is 800-PDS841-S1
	*  @param value
	**/
   public void setPds841S1800(char[] value) {
      pds841S1800 = checkPds841S1800Constraints(value);
      serializePds841S1800(pds841S1800);
   } 

     /**
	 * 	Update Pds841S1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds841S1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPds841S1800,pds841S1800.length);
   	
   }
   
   public void setPds841S1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPds841S1800,pds841S1800.length);
   	
   }
   
     /**
	 * 	Update Pds841S1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds841S1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds841S1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pds841S1800 with another Field
	 *	@param value
	 */
   public void setPds841S1800(Field source) {
       replace(source,0,source.length(),beginPds841S1800,PDS_841_S_1800_LEN);
   	
   }  
   
     /**
	 * 	Update Pds841S1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds841S1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPds841S1800,PDS_841_S_1800_LEN);
   	
   }
   
     /**
	 * 	Update Pds841S1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds841S1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds841S1800+targetIndex,targetLen);
    
   }
	char[] pds8411750Y8880088Value = "1750".toCharArray();
	/**
	 *	Test condition "1750" for isPds8411750Y88800()
	 *	@return  Returns true if isPds8411750Y88800() is "1750"
	 */
   public boolean isPds8411750Y88800() throws CFException {
      return (  compareChars( getPds841S1800() , pds8411750Y8880088Value)  == 0  );
   }


	/**
	*  set values "1750"
	*/
   	public void setPds8411750Y88800True() {  			
    	setPds841S1800( pds8411750Y8880088Value);
   	}
	char[] pds8411754Y8880088Value = "1754".toCharArray();
	/**
	 *	Test condition "1754" for isPds8411754Y88800()
	 *	@return  Returns true if isPds8411754Y88800() is "1754"
	 */
   public boolean isPds8411754Y88800() throws CFException {
      return (  compareChars( getPds841S1800() , pds8411754Y8880088Value)  == 0  );
   }


	/**
	*  set values "1754"
	*/
   	public void setPds8411754Y88800True() {  			
    	setPds841S1800( pds8411754Y8880088Value);
   	}
	char[] pds8411848Y8880088Value = "1848".toCharArray();
	/**
	 *	Test condition "1848" for isPds8411848Y88800()
	 *	@return  Returns true if isPds8411848Y88800() is "1848"
	 */
   public boolean isPds8411848Y88800() throws CFException {
      return (  compareChars( getPds841S1800() , pds8411848Y8880088Value)  == 0  );
   }


	/**
	*  set values "1848"
	*/
   	public void setPds8411848Y88800True() {  			
    	setPds841S1800( pds8411848Y8880088Value);
   	}
	char[] pds8411849Y8880088Value = "1849".toCharArray();
	/**
	 *	Test condition "1849" for isPds8411849Y88800()
	 *	@return  Returns true if isPds8411849Y88800() is "1849"
	 */
   public boolean isPds8411849Y88800() throws CFException {
      return (  compareChars( getPds841S1800() , pds8411849Y8880088Value)  == 0  );
   }


	/**
	*  set values "1849"
	*/
   	public void setPds8411849Y88800True() {  			
    	setPds841S1800( pds8411849Y8880088Value);
   	}
	char[] pds8411850Y8880088Value = "1850".toCharArray();
	/**
	 *	Test condition "1850" for isPds8411850Y88800()
	 *	@return  Returns true if isPds8411850Y88800() is "1850"
	 */
   public boolean isPds8411850Y88800() throws CFException {
      return (  compareChars( getPds841S1800() , pds8411850Y8880088Value)  == 0  );
   }


	/**
	*  set values "1850"
	*/
   	public void setPds8411850Y88800True() {  			
    	setPds841S1800( pds8411850Y8880088Value);
   	}
	char[] pds8411851Y8880088Value = "1851".toCharArray();
	/**
	 *	Test condition "1851" for isPds8411851Y88800()
	 *	@return  Returns true if isPds8411851Y88800() is "1851"
	 */
   public boolean isPds8411851Y88800() throws CFException {
      return (  compareChars( getPds841S1800() , pds8411851Y8880088Value)  == 0  );
   }


	/**
	*  set values "1851"
	*/
   	public void setPds8411851Y88800True() {  			
    	setPds841S1800( pds8411851Y8880088Value);
   	}
	char[] pds8411852Y8880088Value = "1852".toCharArray();
	/**
	 *	Test condition "1852" for isPds8411852Y88800()
	 *	@return  Returns true if isPds8411852Y88800() is "1852"
	 */
   public boolean isPds8411852Y88800() throws CFException {
      return (  compareChars( getPds841S1800() , pds8411852Y8880088Value)  == 0  );
   }


	/**
	*  set values "1852"
	*/
   	public void setPds8411852Y88800True() {  			
    	setPds841S1800( pds8411852Y8880088Value);
   	}

	
	
	

		public static int getPds841800FieldLength() {
			return PDS_841800_LENGTH;
		}

}
  
