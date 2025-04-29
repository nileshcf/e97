package com.cloudframe.app.iovb32k.dto;

/**
*  The class LsParmG is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.iovb32k.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsParmG extends LsParmGSerialized { 
   

						private char[] lsParmMode = Field.fillLowValue(1);


								private long lsParmDataLenMin;


								private long lsParmDataLenMax;
	
	/**
	* Constructor for LsParmG
	**/
    public LsParmG() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LsParmG. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LsParmG(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of lsParmMode
	 *	@return lsParmMode
	 */
   public char[] getLsParmMode() throws CFException{
     if (isLsParmModeModified()) { 
        lsParmMode = refreshLsParmMode();
     }
   		return lsParmMode;
   }

  
	/**
	*  set variable lsParmMode
	*  Corresponding COBOL Variable is LS-PARM-MODE
	*  @param value
	**/
   public void setLsParmMode(char[] value) {
      lsParmMode = checkLsParmModeConstraints(value);
      serializeLsParmMode(lsParmMode);
   } 

     /**
	 * 	Update LsParmMode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsParmMode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsParmMode,lsParmMode.length);
   	
   }
   
   public void setLsParmMode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsParmMode,lsParmMode.length);
   	
   }
   
     /**
	 * 	Update LsParmMode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsParmMode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsParmMode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsParmMode with another Field
	 *	@param value
	 */
   public void setLsParmMode(Field source) {
       replace(source,0,source.length(),beginLsParmMode,LS_PARM_MODE_LEN);
   	
   }  
   
     /**
	 * 	Update LsParmMode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsParmMode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsParmMode,LS_PARM_MODE_LEN);
   	
   }
   
     /**
	 * 	Update LsParmMode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsParmMode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsParmMode+targetIndex,targetLen);
    
   }
	char[] lsParmModeValid88Value1 = "B".toCharArray();
char[] lsParmModeValid88Value2 = "R".toCharArray();
char[] lsParmModeValid88Value3 = "W".toCharArray();

	/**
	 *	Test condition "B" "R" "W" for isLsParmModeValid()
	 *	@return  Returns true if isLsParmModeValid() is "B" "R" "W"
	 */
   public boolean isLsParmModeValid() throws CFException {
      return (  compareChars( getLsParmMode() , lsParmModeValid88Value1)  == 0  ||  compareChars( getLsParmMode() , lsParmModeValid88Value2)  == 0  ||  compareChars( getLsParmMode() , lsParmModeValid88Value3)  == 0  );
   }


	/**
	*  set values "B" "R" "W"
	*/
   	public void setLsParmModeValidTrue() {  			
    	setLsParmMode( lsParmModeValid88Value1);
   	}
	char[] lsParmModeWrite88Value1 = "W".toCharArray();
char[] lsParmModeWrite88Value2 = "B".toCharArray();

	/**
	 *	Test condition "W" "B" for isLsParmModeWrite()
	 *	@return  Returns true if isLsParmModeWrite() is "W" "B"
	 */
   public boolean isLsParmModeWrite() throws CFException {
      return (  compareChars( getLsParmMode() , lsParmModeWrite88Value1)  == 0  ||  compareChars( getLsParmMode() , lsParmModeWrite88Value2)  == 0  );
   }


	/**
	*  set values "W" "B"
	*/
   	public void setLsParmModeWriteTrue() {  			
    	setLsParmMode( lsParmModeWrite88Value1);
   	}
	char[] lsParmModeRead88Value1 = "R".toCharArray();
char[] lsParmModeRead88Value2 = "B".toCharArray();

	/**
	 *	Test condition "R" "B" for isLsParmModeRead()
	 *	@return  Returns true if isLsParmModeRead() is "R" "B"
	 */
   public boolean isLsParmModeRead() throws CFException {
      return (  compareChars( getLsParmMode() , lsParmModeRead88Value1)  == 0  ||  compareChars( getLsParmMode() , lsParmModeRead88Value2)  == 0  );
   }


	/**
	*  set values "R" "B"
	*/
   	public void setLsParmModeReadTrue() {  			
    	setLsParmMode( lsParmModeRead88Value1);
   	}
	char[] lsParmModeBoth88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isLsParmModeBoth()
	 *	@return  Returns true if isLsParmModeBoth() is "B"
	 */
   public boolean isLsParmModeBoth() throws CFException {
      return (  compareChars( getLsParmMode() , lsParmModeBoth88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setLsParmModeBothTrue() {  			
    	setLsParmMode( lsParmModeBoth88Value);
   	}
	/**
	 *	Returns the value of lsParmDataLenMin
	 *	@return lsParmDataLenMin
	 */
	public long getLsParmDataLenMin() throws CFException {
       if (isLsParmDataLenMinModified()) { 
           lsParmDataLenMin = refreshLsParmDataLenMin();
        }
   		return lsParmDataLenMin;
	}
	

	
	   
	/**
	 * 	Update LsParmDataLenMin with the passed value
	 *  Corresponding COBOL Variable is LS-PARM-DATA-LEN-MIN
	 *	@param number
	 */
	public void setLsParmDataLenMin(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsParmDataLenMin = checkLsParmDataLenMinMaxLimit(number); 
		serializeLsParmDataLenMin(lsParmDataLenMin);
	}
	

	/**
	 * 	Update LsParmDataLenMin with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMin(char[] value) throws CFException {
		 lsParmDataLenMin = serializeLsParmDataLenMin(value);
	}
	/**
	 * 	Update LsParmDataLenMin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMinString(char[] value) throws CFException {
		 setLsParmDataLenMin(value);
	}
	/**
	 *	Returns the value of lsParmDataLenMax
	 *	@return lsParmDataLenMax
	 */
	public long getLsParmDataLenMax() throws CFException {
       if (isLsParmDataLenMaxModified()) { 
           lsParmDataLenMax = refreshLsParmDataLenMax();
        }
   		return lsParmDataLenMax;
	}
	

	
	   
	/**
	 * 	Update LsParmDataLenMax with the passed value
	 *  Corresponding COBOL Variable is LS-PARM-DATA-LEN-MAX
	 *	@param number
	 */
	public void setLsParmDataLenMax(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsParmDataLenMax = checkLsParmDataLenMaxMaxLimit(number); 
		serializeLsParmDataLenMax(lsParmDataLenMax);
	}
	

	/**
	 * 	Update LsParmDataLenMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMax(char[] value) throws CFException {
		 lsParmDataLenMax = serializeLsParmDataLenMax(value);
	}
	/**
	 * 	Update LsParmDataLenMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMaxString(char[] value) throws CFException {
		 setLsParmDataLenMax(value);
	}

	
	
	

		public static int getLsParmGFieldLength() {
			return LS_PARM_G_LENGTH;
		}

}
  
