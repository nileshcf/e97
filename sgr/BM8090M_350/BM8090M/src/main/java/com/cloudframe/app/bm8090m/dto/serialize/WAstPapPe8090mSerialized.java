package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WAstPapPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WAstPapPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WAstPapPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_AST_PAP_PE_8090M_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWAstPe8090m;
            protected  int beginWPapPe8090m;
	
	/**
	* Constructor for WAstPapPe8090mSerialized
	**/
    public WAstPapPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WAstPapPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WAstPapPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WAstPapPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2690); // serialize this field at offset 2690 by default 
    }
    
	/**
	* sets parent for this WAstPapPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2690 by default
    }    
	/**
	* initializes the field in WAstPapPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_AST_PAP_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWAstPe8090m = getStartOffset() + 0;	// set offset for serialization
  
             beginWPapPe8090m = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWAstPe8090mCounter = -1;
     public boolean isWAstPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWAstPe8090mCounter != sharedCounter;
         localWAstPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_AST_PE_8090M_LEN = 1;
	/**
	 * 	serialize this WAstPe8090m
	 */
   protected void serializeWAstPe8090m(char[] wAstPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wAstPe8090m,0,getStringValue(),beginWAstPe8090m,W_AST_PE_8090M_LEN);
       localWAstPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWAstPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWAstPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWAstPe8090m() {	 
   		return (substring(getStringValue(),beginWAstPe8090m,beginWAstPe8090m + W_AST_PE_8090M_LEN));
   	}
     int localWPapPe8090mCounter = -1;
     public boolean isWPapPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPapPe8090mCounter != sharedCounter;
         localWPapPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_PAP_PE_8090M_LEN = 19;
	/**
	 * 	serialize this WPapPe8090m
	 */
   protected void serializeWPapPe8090m(char[] wPapPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wPapPe8090m,0,getStringValue(),beginWPapPe8090m,W_PAP_PE_8090M_LEN);
       localWPapPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWPapPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshWPapPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWPapPe8090m() {	 
   		return (substring(getStringValue(),beginWPapPe8090m,beginWPapPe8090m + W_PAP_PE_8090M_LEN));
   	}




}
  
