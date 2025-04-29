package com.cloudframe.app.ar640010.dto;

/**
*  The class GftdsnBuild820Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class GftdsnBuild820Redefined extends GftdsnBuild820RedefinedSerialized { 
   
      private List<char[]> gftdsnPos820; 

	
	/**
	* Constructor for GftdsnBuild820Redefined
	**/
    public GftdsnBuild820Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for GftdsnBuild820Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftdsnBuild820Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of gftdsnPos820
	 *  Corresponding COBOL Variable is 820-GFTDSN-POS
	 *	@return gftdsnPos820
	 */
	public List<char[]> getGftdsnPos820() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < GFTDSN_POS_820_SIZE;index++) {
        	list.add( getGftdsnPos820( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return gftdsnPos820
	 */
	public char[] getGftdsnPos820(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getGftdsnPos820(), resetting it to 0",index);
		    index = 0;
        } else if (index >= GFTDSN_POS_820_SIZE) {
             	index = GFTDSN_POS_820_SIZE -1; // can't exceed max array size
             	logger.trace("gftdsnPos820 - Array index exceeded max Size {}, resetting it to max allowed",GFTDSN_POS_820_SIZE); 
	    }
   	      return getCharArray( (beginGftdsnPos820 + index*GFTDSN_POS_820_LEN) , GFTDSN_POS_820_LEN );
    }
    
    
   public int  gftdsnPos820FieldLength() {
   	return GFTDSN_POS_820_LEN;
   }
   
	

  
  	/**
	 *	Update GftdsnPos820 with the passed value at a given index
	 *  Corresponding COBOL Variable is 820-GFTDSN-POS
	 *  @param index
	 *	@param value
	 */
  public void setGftdsnPos820(int index,char[] value) {
   	setGftdsnPos820(index,value,true);
   }
   
   
   /**
	 *	Update GftdsnPos820 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setGftdsnPos820(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setGftdsnPos820(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeGftdsnPos820(index,value);		
       }
   }
   
	 
	/**
	 *	Test condition "A" THRU "I" "J" THRU "R" "S" THRU "Z" "0" THRU "9" "." "#" "$" "@" for isGftPosValid88820()
	 *	@return Returns true if isGftPosValid88820() is "A" THRU "I" "J" THRU "R" "S" THRU "Z" "0" THRU "9" "." "#" "$" "@"
	 */
   public boolean isGftPosValid88820(int index) throws CFException  {
      return (  isGreaterOrEqual(getGftdsnPos820(index), "A" ) &&  isLessOrEqual(getGftdsnPos820(index),"I" )  ||  isGreaterOrEqual(getGftdsnPos820(index), "J" ) &&  isLessOrEqual(getGftdsnPos820(index),"R" )  ||  isGreaterOrEqual(getGftdsnPos820(index), "S" ) &&  isLessOrEqual(getGftdsnPos820(index),"Z" )  ||  isGreaterOrEqual(getGftdsnPos820(index), "0" ) &&  isLessOrEqual(getGftdsnPos820(index),"9" )  ||  compareChars( getGftdsnPos820(index) , ".".toCharArray())  == 0  ||  compareChars( getGftdsnPos820(index) , "#".toCharArray())  == 0  ||  compareChars( getGftdsnPos820(index) , "$".toCharArray())  == 0  ||  compareChars( getGftdsnPos820(index) , "@".toCharArray())  == 0  );
   }
	/**
	*  set values "A" THRU "I" "J" THRU "R" "S" THRU "Z" "0" THRU "9" "." "#" "$" "@"
	*  @param index
	*/
   	public void setGftPosValid88820True(int index) {
    	setGftdsnPos820(index , "A".toCharArray()); 
   	}
	 char[] gftPosDash8882088Value = "-".toCharArray();
	/**
	 *	Test condition "-" for isGftPosDash88820()
	 *	@return Returns true if isGftPosDash88820() is "-"
	 */
   public boolean isGftPosDash88820(int index) throws CFException  {
      return (  compareChars( getGftdsnPos820(index) , gftPosDash8882088Value)  == 0  );
   }
	/**
	*  set values "-"
	*  @param index
	*/
   	public void setGftPosDash88820True(int index) {
    	setGftdsnPos820(index , "gftPosDash8882088Value".toCharArray()); 
   	}

	
	
	

		public static int getGftdsnBuild820RedefinedFieldLength() {
			return GFTDSN_BUILD_820_REDEFINED_LENGTH;
		}

}
  
