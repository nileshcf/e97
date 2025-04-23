package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class SyntaxPgmTable500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SyntaxPgmTable500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SyntaxPgmTable500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYNTAX_PGM_TABLE_500_LENGTH = 144;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPtrIp200690500;
            protected  int beginSyntaxIp200690Name500;
            protected  int beginPtrIp202330500;
            protected  int beginSyntaxIp202330Name500;
            protected  int beginPtrIp209700500;
            protected  int beginSyntaxIp209700Name500;
            protected  int beginPtrIp209720500;
            protected  int beginSyntaxIp209720Name500;
            protected  int beginPtrIp218620500;
            protected  int beginSyntaxIp218620Name500;
            protected  int beginPtrIp221080500;
            protected  int beginSyntaxIp221080Name500;
            protected  int beginPtrIp223190500;
            protected  int beginSyntaxIp223190Name500;
            protected  int beginPtrIp223870500;
            protected  int beginSyntaxIp223870Name500;
            protected  int beginPtrIp202990500;
            protected  int beginSyntaxIp202990Name500;
	
	/**
	* Constructor for SyntaxPgmTable500Serialized
	**/
    public SyntaxPgmTable500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SyntaxPgmTable500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxPgmTable500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SyntaxPgmTable500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SyntaxPgmTable500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SyntaxPgmTable500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYNTAX_PGM_TABLE_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPtrIp200690500 = getStartOffset() + 0;	// set offset for serialization
  
             beginSyntaxIp200690Name500 = getStartOffset() + 8;	// set offset for serialization
  
             beginPtrIp202330500 = getStartOffset() + 16;	// set offset for serialization
  
             beginSyntaxIp202330Name500 = getStartOffset() + 24;	// set offset for serialization
  
             beginPtrIp209700500 = getStartOffset() + 32;	// set offset for serialization
  
             beginSyntaxIp209700Name500 = getStartOffset() + 40;	// set offset for serialization
  
             beginPtrIp209720500 = getStartOffset() + 48;	// set offset for serialization
  
             beginSyntaxIp209720Name500 = getStartOffset() + 56;	// set offset for serialization
  
             beginPtrIp218620500 = getStartOffset() + 64;	// set offset for serialization
  
             beginSyntaxIp218620Name500 = getStartOffset() + 72;	// set offset for serialization
  
             beginPtrIp221080500 = getStartOffset() + 80;	// set offset for serialization
  
             beginSyntaxIp221080Name500 = getStartOffset() + 88;	// set offset for serialization
  
             beginPtrIp223190500 = getStartOffset() + 96;	// set offset for serialization
  
             beginSyntaxIp223190Name500 = getStartOffset() + 104;	// set offset for serialization
  
             beginPtrIp223870500 = getStartOffset() + 112;	// set offset for serialization
  
             beginSyntaxIp223870Name500 = getStartOffset() + 120;	// set offset for serialization
  
             beginPtrIp202990500 = getStartOffset() + 128;	// set offset for serialization
  
             beginSyntaxIp202990Name500 = getStartOffset() + 136;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPtrIp200690500Counter = -1;
     public boolean isPtrIp200690500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp200690500Counter != sharedCounter;
         localPtrIp200690500Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_IP_200690500_LEN = 8;
	/**
	 * 	serialize this PtrIp200690500
	 */
   protected void serializePtrIp200690500(char[] ptrIp200690500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrIp200690500,0,getStringValue(),beginPtrIp200690500,PTR_IP_200690500_LEN);
       localPtrIp200690500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrIp200690500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrIp200690500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrIp200690500() {	 
   		return (substring(getStringValue(),beginPtrIp200690500,beginPtrIp200690500 + PTR_IP_200690500_LEN));
   	}
     int localSyntaxIp200690Name500Counter = -1;
     public boolean isSyntaxIp200690Name500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxIp200690Name500Counter != sharedCounter;
         localSyntaxIp200690Name500Counter = sharedCounter; return hasModified;
     }
	protected static final int SYNTAX_IP_200690_NAME_500_LEN = 8;
	/**
	 * 	serialize this SyntaxIp200690Name500
	 */
   protected void serializeSyntaxIp200690Name500(char[] syntaxIp200690Name500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(syntaxIp200690Name500,0,getStringValue(),beginSyntaxIp200690Name500,SYNTAX_IP_200690_NAME_500_LEN);
       localSyntaxIp200690Name500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSyntaxIp200690Name500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSyntaxIp200690Name500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSyntaxIp200690Name500() {	 
   		return (substring(getStringValue(),beginSyntaxIp200690Name500,beginSyntaxIp200690Name500 + SYNTAX_IP_200690_NAME_500_LEN));
   	}
     int localPtrIp202330500Counter = -1;
     public boolean isPtrIp202330500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp202330500Counter != sharedCounter;
         localPtrIp202330500Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_IP_202330500_LEN = 8;
	/**
	 * 	serialize this PtrIp202330500
	 */
   protected void serializePtrIp202330500(char[] ptrIp202330500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrIp202330500,0,getStringValue(),beginPtrIp202330500,PTR_IP_202330500_LEN);
       localPtrIp202330500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrIp202330500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrIp202330500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrIp202330500() {	 
   		return (substring(getStringValue(),beginPtrIp202330500,beginPtrIp202330500 + PTR_IP_202330500_LEN));
   	}
     int localSyntaxIp202330Name500Counter = -1;
     public boolean isSyntaxIp202330Name500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxIp202330Name500Counter != sharedCounter;
         localSyntaxIp202330Name500Counter = sharedCounter; return hasModified;
     }
	protected static final int SYNTAX_IP_202330_NAME_500_LEN = 8;
	/**
	 * 	serialize this SyntaxIp202330Name500
	 */
   protected void serializeSyntaxIp202330Name500(char[] syntaxIp202330Name500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(syntaxIp202330Name500,0,getStringValue(),beginSyntaxIp202330Name500,SYNTAX_IP_202330_NAME_500_LEN);
       localSyntaxIp202330Name500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSyntaxIp202330Name500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSyntaxIp202330Name500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSyntaxIp202330Name500() {	 
   		return (substring(getStringValue(),beginSyntaxIp202330Name500,beginSyntaxIp202330Name500 + SYNTAX_IP_202330_NAME_500_LEN));
   	}
     int localPtrIp209700500Counter = -1;
     public boolean isPtrIp209700500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp209700500Counter != sharedCounter;
         localPtrIp209700500Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_IP_209700500_LEN = 8;
	/**
	 * 	serialize this PtrIp209700500
	 */
   protected void serializePtrIp209700500(char[] ptrIp209700500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrIp209700500,0,getStringValue(),beginPtrIp209700500,PTR_IP_209700500_LEN);
       localPtrIp209700500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrIp209700500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrIp209700500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrIp209700500() {	 
   		return (substring(getStringValue(),beginPtrIp209700500,beginPtrIp209700500 + PTR_IP_209700500_LEN));
   	}
     int localSyntaxIp209700Name500Counter = -1;
     public boolean isSyntaxIp209700Name500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxIp209700Name500Counter != sharedCounter;
         localSyntaxIp209700Name500Counter = sharedCounter; return hasModified;
     }
	protected static final int SYNTAX_IP_209700_NAME_500_LEN = 8;
	/**
	 * 	serialize this SyntaxIp209700Name500
	 */
   protected void serializeSyntaxIp209700Name500(char[] syntaxIp209700Name500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(syntaxIp209700Name500,0,getStringValue(),beginSyntaxIp209700Name500,SYNTAX_IP_209700_NAME_500_LEN);
       localSyntaxIp209700Name500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSyntaxIp209700Name500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSyntaxIp209700Name500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSyntaxIp209700Name500() {	 
   		return (substring(getStringValue(),beginSyntaxIp209700Name500,beginSyntaxIp209700Name500 + SYNTAX_IP_209700_NAME_500_LEN));
   	}
     int localPtrIp209720500Counter = -1;
     public boolean isPtrIp209720500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp209720500Counter != sharedCounter;
         localPtrIp209720500Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_IP_209720500_LEN = 8;
	/**
	 * 	serialize this PtrIp209720500
	 */
   protected void serializePtrIp209720500(char[] ptrIp209720500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrIp209720500,0,getStringValue(),beginPtrIp209720500,PTR_IP_209720500_LEN);
       localPtrIp209720500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrIp209720500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrIp209720500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrIp209720500() {	 
   		return (substring(getStringValue(),beginPtrIp209720500,beginPtrIp209720500 + PTR_IP_209720500_LEN));
   	}
     int localSyntaxIp209720Name500Counter = -1;
     public boolean isSyntaxIp209720Name500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxIp209720Name500Counter != sharedCounter;
         localSyntaxIp209720Name500Counter = sharedCounter; return hasModified;
     }
	protected static final int SYNTAX_IP_209720_NAME_500_LEN = 8;
	/**
	 * 	serialize this SyntaxIp209720Name500
	 */
   protected void serializeSyntaxIp209720Name500(char[] syntaxIp209720Name500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(syntaxIp209720Name500,0,getStringValue(),beginSyntaxIp209720Name500,SYNTAX_IP_209720_NAME_500_LEN);
       localSyntaxIp209720Name500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSyntaxIp209720Name500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSyntaxIp209720Name500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSyntaxIp209720Name500() {	 
   		return (substring(getStringValue(),beginSyntaxIp209720Name500,beginSyntaxIp209720Name500 + SYNTAX_IP_209720_NAME_500_LEN));
   	}
     int localPtrIp218620500Counter = -1;
     public boolean isPtrIp218620500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp218620500Counter != sharedCounter;
         localPtrIp218620500Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_IP_218620500_LEN = 8;
	/**
	 * 	serialize this PtrIp218620500
	 */
   protected void serializePtrIp218620500(char[] ptrIp218620500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrIp218620500,0,getStringValue(),beginPtrIp218620500,PTR_IP_218620500_LEN);
       localPtrIp218620500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrIp218620500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrIp218620500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrIp218620500() {	 
   		return (substring(getStringValue(),beginPtrIp218620500,beginPtrIp218620500 + PTR_IP_218620500_LEN));
   	}
     int localSyntaxIp218620Name500Counter = -1;
     public boolean isSyntaxIp218620Name500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxIp218620Name500Counter != sharedCounter;
         localSyntaxIp218620Name500Counter = sharedCounter; return hasModified;
     }
	protected static final int SYNTAX_IP_218620_NAME_500_LEN = 8;
	/**
	 * 	serialize this SyntaxIp218620Name500
	 */
   protected void serializeSyntaxIp218620Name500(char[] syntaxIp218620Name500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(syntaxIp218620Name500,0,getStringValue(),beginSyntaxIp218620Name500,SYNTAX_IP_218620_NAME_500_LEN);
       localSyntaxIp218620Name500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSyntaxIp218620Name500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSyntaxIp218620Name500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSyntaxIp218620Name500() {	 
   		return (substring(getStringValue(),beginSyntaxIp218620Name500,beginSyntaxIp218620Name500 + SYNTAX_IP_218620_NAME_500_LEN));
   	}
     int localPtrIp221080500Counter = -1;
     public boolean isPtrIp221080500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp221080500Counter != sharedCounter;
         localPtrIp221080500Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_IP_221080500_LEN = 8;
	/**
	 * 	serialize this PtrIp221080500
	 */
   protected void serializePtrIp221080500(char[] ptrIp221080500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrIp221080500,0,getStringValue(),beginPtrIp221080500,PTR_IP_221080500_LEN);
       localPtrIp221080500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrIp221080500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrIp221080500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrIp221080500() {	 
   		return (substring(getStringValue(),beginPtrIp221080500,beginPtrIp221080500 + PTR_IP_221080500_LEN));
   	}
     int localSyntaxIp221080Name500Counter = -1;
     public boolean isSyntaxIp221080Name500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxIp221080Name500Counter != sharedCounter;
         localSyntaxIp221080Name500Counter = sharedCounter; return hasModified;
     }
	protected static final int SYNTAX_IP_221080_NAME_500_LEN = 8;
	/**
	 * 	serialize this SyntaxIp221080Name500
	 */
   protected void serializeSyntaxIp221080Name500(char[] syntaxIp221080Name500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(syntaxIp221080Name500,0,getStringValue(),beginSyntaxIp221080Name500,SYNTAX_IP_221080_NAME_500_LEN);
       localSyntaxIp221080Name500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSyntaxIp221080Name500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSyntaxIp221080Name500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSyntaxIp221080Name500() {	 
   		return (substring(getStringValue(),beginSyntaxIp221080Name500,beginSyntaxIp221080Name500 + SYNTAX_IP_221080_NAME_500_LEN));
   	}
     int localPtrIp223190500Counter = -1;
     public boolean isPtrIp223190500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp223190500Counter != sharedCounter;
         localPtrIp223190500Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_IP_223190500_LEN = 8;
	/**
	 * 	serialize this PtrIp223190500
	 */
   protected void serializePtrIp223190500(char[] ptrIp223190500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrIp223190500,0,getStringValue(),beginPtrIp223190500,PTR_IP_223190500_LEN);
       localPtrIp223190500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrIp223190500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrIp223190500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrIp223190500() {	 
   		return (substring(getStringValue(),beginPtrIp223190500,beginPtrIp223190500 + PTR_IP_223190500_LEN));
   	}
     int localSyntaxIp223190Name500Counter = -1;
     public boolean isSyntaxIp223190Name500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxIp223190Name500Counter != sharedCounter;
         localSyntaxIp223190Name500Counter = sharedCounter; return hasModified;
     }
	protected static final int SYNTAX_IP_223190_NAME_500_LEN = 8;
	/**
	 * 	serialize this SyntaxIp223190Name500
	 */
   protected void serializeSyntaxIp223190Name500(char[] syntaxIp223190Name500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(syntaxIp223190Name500,0,getStringValue(),beginSyntaxIp223190Name500,SYNTAX_IP_223190_NAME_500_LEN);
       localSyntaxIp223190Name500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSyntaxIp223190Name500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSyntaxIp223190Name500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSyntaxIp223190Name500() {	 
   		return (substring(getStringValue(),beginSyntaxIp223190Name500,beginSyntaxIp223190Name500 + SYNTAX_IP_223190_NAME_500_LEN));
   	}
     int localPtrIp223870500Counter = -1;
     public boolean isPtrIp223870500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp223870500Counter != sharedCounter;
         localPtrIp223870500Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_IP_223870500_LEN = 8;
	/**
	 * 	serialize this PtrIp223870500
	 */
   protected void serializePtrIp223870500(char[] ptrIp223870500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrIp223870500,0,getStringValue(),beginPtrIp223870500,PTR_IP_223870500_LEN);
       localPtrIp223870500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrIp223870500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrIp223870500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrIp223870500() {	 
   		return (substring(getStringValue(),beginPtrIp223870500,beginPtrIp223870500 + PTR_IP_223870500_LEN));
   	}
     int localSyntaxIp223870Name500Counter = -1;
     public boolean isSyntaxIp223870Name500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxIp223870Name500Counter != sharedCounter;
         localSyntaxIp223870Name500Counter = sharedCounter; return hasModified;
     }
	protected static final int SYNTAX_IP_223870_NAME_500_LEN = 8;
	/**
	 * 	serialize this SyntaxIp223870Name500
	 */
   protected void serializeSyntaxIp223870Name500(char[] syntaxIp223870Name500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(syntaxIp223870Name500,0,getStringValue(),beginSyntaxIp223870Name500,SYNTAX_IP_223870_NAME_500_LEN);
       localSyntaxIp223870Name500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSyntaxIp223870Name500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSyntaxIp223870Name500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSyntaxIp223870Name500() {	 
   		return (substring(getStringValue(),beginSyntaxIp223870Name500,beginSyntaxIp223870Name500 + SYNTAX_IP_223870_NAME_500_LEN));
   	}
     int localPtrIp202990500Counter = -1;
     public boolean isPtrIp202990500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp202990500Counter != sharedCounter;
         localPtrIp202990500Counter = sharedCounter; return hasModified;
     }
	protected static final int PTR_IP_202990500_LEN = 8;
	/**
	 * 	serialize this PtrIp202990500
	 */
   protected void serializePtrIp202990500(char[] ptrIp202990500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptrIp202990500,0,getStringValue(),beginPtrIp202990500,PTR_IP_202990500_LEN);
       localPtrIp202990500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtrIp202990500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtrIp202990500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtrIp202990500() {	 
   		return (substring(getStringValue(),beginPtrIp202990500,beginPtrIp202990500 + PTR_IP_202990500_LEN));
   	}
     int localSyntaxIp202990Name500Counter = -1;
     public boolean isSyntaxIp202990Name500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxIp202990Name500Counter != sharedCounter;
         localSyntaxIp202990Name500Counter = sharedCounter; return hasModified;
     }
	protected static final int SYNTAX_IP_202990_NAME_500_LEN = 8;
	/**
	 * 	serialize this SyntaxIp202990Name500
	 */
   protected void serializeSyntaxIp202990Name500(char[] syntaxIp202990Name500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(syntaxIp202990Name500,0,getStringValue(),beginSyntaxIp202990Name500,SYNTAX_IP_202990_NAME_500_LEN);
       localSyntaxIp202990Name500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSyntaxIp202990Name500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSyntaxIp202990Name500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSyntaxIp202990Name500() {	 
   		return (substring(getStringValue(),beginSyntaxIp202990Name500,beginSyntaxIp202990Name500 + SYNTAX_IP_202990_NAME_500_LEN));
   	}




}
  
