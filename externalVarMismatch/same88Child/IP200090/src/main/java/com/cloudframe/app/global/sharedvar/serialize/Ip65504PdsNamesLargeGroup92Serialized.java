package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup92Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup92Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup92Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_92_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2822S;
            protected  int beginIp65504P2822L;
            protected  int beginIp65504P2823S;
            protected  int beginIp65504P2823L;
            protected  int beginIp65504P2824S;
            protected  int beginIp65504P2824L;
            protected  int beginIp65504P2825S;
            protected  int beginIp65504P2825L;
            protected  int beginIp65504P2826S;
            protected  int beginIp65504P2826L;
            protected  int beginIp65504P2827S;
            protected  int beginIp65504P2827L;
            protected  int beginIp65504P2828S;
            protected  int beginIp65504P2828L;
            protected  int beginIp65504P2829S;
            protected  int beginIp65504P2829L;
            protected  int beginIp65504P2830S;
            protected  int beginIp65504P2830L;
            protected  int beginIp65504P2831S;
            protected  int beginIp65504P2831L;
            protected  int beginIp65504P2832S;
            protected  int beginIp65504P2832L;
            protected  int beginIp65504P2833S;
            protected  int beginIp65504P2833L;
            protected  int beginIp65504P2834S;
            protected  int beginIp65504P2834L;
            protected  int beginIp65504P2835S;
            protected  int beginIp65504P2835L;
            protected  int beginIp65504P2836S;
            protected  int beginIp65504P2836L;
            protected  int beginIp65504P2837S;
            protected  int beginIp65504P2837L;
            protected  int beginIp65504P2838S;
            protected  int beginIp65504P2838L;
            protected  int beginIp65504P2839S;
            protected  int beginIp65504P2839L;
            protected  int beginIp65504P2840S;
            protected  int beginIp65504P2840L;
            protected  int beginIp65504P2841S;
            protected  int beginIp65504P2841L;
            protected  int beginIp65504P2842S;
            protected  int beginIp65504P2842L;
            protected  int beginIp65504P2843S;
            protected  int beginIp65504P2843L;
            protected  int beginIp65504P2844S;
            protected  int beginIp65504P2844L;
            protected  int beginIp65504P2845S;
            protected  int beginIp65504P2845L;
            protected  int beginIp65504P2846S;
            protected  int beginIp65504P2846L;
            protected  int beginIp65504P2847S;
            protected  int beginIp65504P2847L;
            protected  int beginIp65504P2848S;
            protected  int beginIp65504P2848L;
            protected  int beginIp65504P2849S;
            protected  int beginIp65504P2849L;
            protected  int beginIp65504P2850S;
            protected  int beginIp65504P2850L;
            protected  int beginIp65504P2851S;
            protected  int beginIp65504P2851L;
            protected  int beginIp65504P2852S;
            protected  int beginIp65504P2852L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup92Serialized
	**/
    public Ip65504PdsNamesLargeGroup92Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup92Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup92Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup92Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,22564); // serialize this field at offset 22564 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup92Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 22564 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup92Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_92_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2822S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2822L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2823S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2823L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2824S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2824L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2825S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2825L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2826S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2826L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2827S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2827L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2828S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2828L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2829S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2829L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2830S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2830L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2831S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2831L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2832S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2832L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2833S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2833L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2834S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2834L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2835S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2835L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2836S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2836L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2837S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2837L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2838S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2838L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2839S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2839L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2840S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2840L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2841S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2841L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2842S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2842L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2843S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2843L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2844S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2844L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2845S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2845L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2846S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2846L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2847S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2847L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2848S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2848L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2849S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2849L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2850S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2850L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2851S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2851L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2852S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2852L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2822SCounter = -1;
         public boolean isIp65504P2822SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2822SCounter != sharedCounter;
            localIp65504P2822SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2822_S_LEN = 2;
  	/**
	 * serializeIp65504P2822S
	 */
	protected void serializeIp65504P2822S(short ip65504P2822S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2822S,IP_65504_P_2822_S_LEN)
                  ,beginIp65504P2822S
                  ,IP_65504_P_2822_S_LEN
                 );
            localIp65504P2822SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2822SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2822S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2822S() {	 
			return (getShort(beginIp65504P2822S));
   	}
         int localIp65504P2822LCounter = -1;
         public boolean isIp65504P2822LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2822LCounter != sharedCounter;
            localIp65504P2822LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2822_L_LEN = 2;
  	/**
	 * serializeIp65504P2822L
	 */
	protected void serializeIp65504P2822L(short ip65504P2822L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2822L,IP_65504_P_2822_L_LEN)
                  ,beginIp65504P2822L
                  ,IP_65504_P_2822_L_LEN
                 );
            localIp65504P2822LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2822LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2822L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2822L() {	 
			return (getShort(beginIp65504P2822L));
   	}
         int localIp65504P2823SCounter = -1;
         public boolean isIp65504P2823SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2823SCounter != sharedCounter;
            localIp65504P2823SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2823_S_LEN = 2;
  	/**
	 * serializeIp65504P2823S
	 */
	protected void serializeIp65504P2823S(short ip65504P2823S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2823S,IP_65504_P_2823_S_LEN)
                  ,beginIp65504P2823S
                  ,IP_65504_P_2823_S_LEN
                 );
            localIp65504P2823SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2823SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2823S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2823S() {	 
			return (getShort(beginIp65504P2823S));
   	}
         int localIp65504P2823LCounter = -1;
         public boolean isIp65504P2823LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2823LCounter != sharedCounter;
            localIp65504P2823LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2823_L_LEN = 2;
  	/**
	 * serializeIp65504P2823L
	 */
	protected void serializeIp65504P2823L(short ip65504P2823L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2823L,IP_65504_P_2823_L_LEN)
                  ,beginIp65504P2823L
                  ,IP_65504_P_2823_L_LEN
                 );
            localIp65504P2823LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2823LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2823L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2823L() {	 
			return (getShort(beginIp65504P2823L));
   	}
         int localIp65504P2824SCounter = -1;
         public boolean isIp65504P2824SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2824SCounter != sharedCounter;
            localIp65504P2824SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2824_S_LEN = 2;
  	/**
	 * serializeIp65504P2824S
	 */
	protected void serializeIp65504P2824S(short ip65504P2824S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2824S,IP_65504_P_2824_S_LEN)
                  ,beginIp65504P2824S
                  ,IP_65504_P_2824_S_LEN
                 );
            localIp65504P2824SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2824SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2824S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2824S() {	 
			return (getShort(beginIp65504P2824S));
   	}
         int localIp65504P2824LCounter = -1;
         public boolean isIp65504P2824LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2824LCounter != sharedCounter;
            localIp65504P2824LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2824_L_LEN = 2;
  	/**
	 * serializeIp65504P2824L
	 */
	protected void serializeIp65504P2824L(short ip65504P2824L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2824L,IP_65504_P_2824_L_LEN)
                  ,beginIp65504P2824L
                  ,IP_65504_P_2824_L_LEN
                 );
            localIp65504P2824LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2824LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2824L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2824L() {	 
			return (getShort(beginIp65504P2824L));
   	}
         int localIp65504P2825SCounter = -1;
         public boolean isIp65504P2825SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2825SCounter != sharedCounter;
            localIp65504P2825SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2825_S_LEN = 2;
  	/**
	 * serializeIp65504P2825S
	 */
	protected void serializeIp65504P2825S(short ip65504P2825S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2825S,IP_65504_P_2825_S_LEN)
                  ,beginIp65504P2825S
                  ,IP_65504_P_2825_S_LEN
                 );
            localIp65504P2825SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2825SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2825S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2825S() {	 
			return (getShort(beginIp65504P2825S));
   	}
         int localIp65504P2825LCounter = -1;
         public boolean isIp65504P2825LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2825LCounter != sharedCounter;
            localIp65504P2825LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2825_L_LEN = 2;
  	/**
	 * serializeIp65504P2825L
	 */
	protected void serializeIp65504P2825L(short ip65504P2825L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2825L,IP_65504_P_2825_L_LEN)
                  ,beginIp65504P2825L
                  ,IP_65504_P_2825_L_LEN
                 );
            localIp65504P2825LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2825LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2825L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2825L() {	 
			return (getShort(beginIp65504P2825L));
   	}
         int localIp65504P2826SCounter = -1;
         public boolean isIp65504P2826SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2826SCounter != sharedCounter;
            localIp65504P2826SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2826_S_LEN = 2;
  	/**
	 * serializeIp65504P2826S
	 */
	protected void serializeIp65504P2826S(short ip65504P2826S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2826S,IP_65504_P_2826_S_LEN)
                  ,beginIp65504P2826S
                  ,IP_65504_P_2826_S_LEN
                 );
            localIp65504P2826SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2826SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2826S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2826S() {	 
			return (getShort(beginIp65504P2826S));
   	}
         int localIp65504P2826LCounter = -1;
         public boolean isIp65504P2826LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2826LCounter != sharedCounter;
            localIp65504P2826LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2826_L_LEN = 2;
  	/**
	 * serializeIp65504P2826L
	 */
	protected void serializeIp65504P2826L(short ip65504P2826L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2826L,IP_65504_P_2826_L_LEN)
                  ,beginIp65504P2826L
                  ,IP_65504_P_2826_L_LEN
                 );
            localIp65504P2826LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2826LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2826L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2826L() {	 
			return (getShort(beginIp65504P2826L));
   	}
         int localIp65504P2827SCounter = -1;
         public boolean isIp65504P2827SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2827SCounter != sharedCounter;
            localIp65504P2827SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2827_S_LEN = 2;
  	/**
	 * serializeIp65504P2827S
	 */
	protected void serializeIp65504P2827S(short ip65504P2827S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2827S,IP_65504_P_2827_S_LEN)
                  ,beginIp65504P2827S
                  ,IP_65504_P_2827_S_LEN
                 );
            localIp65504P2827SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2827SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2827S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2827S() {	 
			return (getShort(beginIp65504P2827S));
   	}
         int localIp65504P2827LCounter = -1;
         public boolean isIp65504P2827LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2827LCounter != sharedCounter;
            localIp65504P2827LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2827_L_LEN = 2;
  	/**
	 * serializeIp65504P2827L
	 */
	protected void serializeIp65504P2827L(short ip65504P2827L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2827L,IP_65504_P_2827_L_LEN)
                  ,beginIp65504P2827L
                  ,IP_65504_P_2827_L_LEN
                 );
            localIp65504P2827LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2827LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2827L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2827L() {	 
			return (getShort(beginIp65504P2827L));
   	}
         int localIp65504P2828SCounter = -1;
         public boolean isIp65504P2828SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2828SCounter != sharedCounter;
            localIp65504P2828SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2828_S_LEN = 2;
  	/**
	 * serializeIp65504P2828S
	 */
	protected void serializeIp65504P2828S(short ip65504P2828S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2828S,IP_65504_P_2828_S_LEN)
                  ,beginIp65504P2828S
                  ,IP_65504_P_2828_S_LEN
                 );
            localIp65504P2828SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2828SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2828S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2828S() {	 
			return (getShort(beginIp65504P2828S));
   	}
         int localIp65504P2828LCounter = -1;
         public boolean isIp65504P2828LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2828LCounter != sharedCounter;
            localIp65504P2828LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2828_L_LEN = 2;
  	/**
	 * serializeIp65504P2828L
	 */
	protected void serializeIp65504P2828L(short ip65504P2828L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2828L,IP_65504_P_2828_L_LEN)
                  ,beginIp65504P2828L
                  ,IP_65504_P_2828_L_LEN
                 );
            localIp65504P2828LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2828LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2828L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2828L() {	 
			return (getShort(beginIp65504P2828L));
   	}
         int localIp65504P2829SCounter = -1;
         public boolean isIp65504P2829SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2829SCounter != sharedCounter;
            localIp65504P2829SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2829_S_LEN = 2;
  	/**
	 * serializeIp65504P2829S
	 */
	protected void serializeIp65504P2829S(short ip65504P2829S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2829S,IP_65504_P_2829_S_LEN)
                  ,beginIp65504P2829S
                  ,IP_65504_P_2829_S_LEN
                 );
            localIp65504P2829SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2829SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2829S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2829S() {	 
			return (getShort(beginIp65504P2829S));
   	}
         int localIp65504P2829LCounter = -1;
         public boolean isIp65504P2829LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2829LCounter != sharedCounter;
            localIp65504P2829LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2829_L_LEN = 2;
  	/**
	 * serializeIp65504P2829L
	 */
	protected void serializeIp65504P2829L(short ip65504P2829L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2829L,IP_65504_P_2829_L_LEN)
                  ,beginIp65504P2829L
                  ,IP_65504_P_2829_L_LEN
                 );
            localIp65504P2829LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2829LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2829L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2829L() {	 
			return (getShort(beginIp65504P2829L));
   	}
         int localIp65504P2830SCounter = -1;
         public boolean isIp65504P2830SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2830SCounter != sharedCounter;
            localIp65504P2830SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2830_S_LEN = 2;
  	/**
	 * serializeIp65504P2830S
	 */
	protected void serializeIp65504P2830S(short ip65504P2830S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2830S,IP_65504_P_2830_S_LEN)
                  ,beginIp65504P2830S
                  ,IP_65504_P_2830_S_LEN
                 );
            localIp65504P2830SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2830SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2830S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2830S() {	 
			return (getShort(beginIp65504P2830S));
   	}
         int localIp65504P2830LCounter = -1;
         public boolean isIp65504P2830LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2830LCounter != sharedCounter;
            localIp65504P2830LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2830_L_LEN = 2;
  	/**
	 * serializeIp65504P2830L
	 */
	protected void serializeIp65504P2830L(short ip65504P2830L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2830L,IP_65504_P_2830_L_LEN)
                  ,beginIp65504P2830L
                  ,IP_65504_P_2830_L_LEN
                 );
            localIp65504P2830LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2830LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2830L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2830L() {	 
			return (getShort(beginIp65504P2830L));
   	}
         int localIp65504P2831SCounter = -1;
         public boolean isIp65504P2831SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2831SCounter != sharedCounter;
            localIp65504P2831SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2831_S_LEN = 2;
  	/**
	 * serializeIp65504P2831S
	 */
	protected void serializeIp65504P2831S(short ip65504P2831S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2831S,IP_65504_P_2831_S_LEN)
                  ,beginIp65504P2831S
                  ,IP_65504_P_2831_S_LEN
                 );
            localIp65504P2831SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2831SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2831S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2831S() {	 
			return (getShort(beginIp65504P2831S));
   	}
         int localIp65504P2831LCounter = -1;
         public boolean isIp65504P2831LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2831LCounter != sharedCounter;
            localIp65504P2831LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2831_L_LEN = 2;
  	/**
	 * serializeIp65504P2831L
	 */
	protected void serializeIp65504P2831L(short ip65504P2831L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2831L,IP_65504_P_2831_L_LEN)
                  ,beginIp65504P2831L
                  ,IP_65504_P_2831_L_LEN
                 );
            localIp65504P2831LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2831LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2831L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2831L() {	 
			return (getShort(beginIp65504P2831L));
   	}
         int localIp65504P2832SCounter = -1;
         public boolean isIp65504P2832SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2832SCounter != sharedCounter;
            localIp65504P2832SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2832_S_LEN = 2;
  	/**
	 * serializeIp65504P2832S
	 */
	protected void serializeIp65504P2832S(short ip65504P2832S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2832S,IP_65504_P_2832_S_LEN)
                  ,beginIp65504P2832S
                  ,IP_65504_P_2832_S_LEN
                 );
            localIp65504P2832SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2832SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2832S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2832S() {	 
			return (getShort(beginIp65504P2832S));
   	}
         int localIp65504P2832LCounter = -1;
         public boolean isIp65504P2832LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2832LCounter != sharedCounter;
            localIp65504P2832LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2832_L_LEN = 2;
  	/**
	 * serializeIp65504P2832L
	 */
	protected void serializeIp65504P2832L(short ip65504P2832L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2832L,IP_65504_P_2832_L_LEN)
                  ,beginIp65504P2832L
                  ,IP_65504_P_2832_L_LEN
                 );
            localIp65504P2832LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2832LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2832L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2832L() {	 
			return (getShort(beginIp65504P2832L));
   	}
         int localIp65504P2833SCounter = -1;
         public boolean isIp65504P2833SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2833SCounter != sharedCounter;
            localIp65504P2833SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2833_S_LEN = 2;
  	/**
	 * serializeIp65504P2833S
	 */
	protected void serializeIp65504P2833S(short ip65504P2833S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2833S,IP_65504_P_2833_S_LEN)
                  ,beginIp65504P2833S
                  ,IP_65504_P_2833_S_LEN
                 );
            localIp65504P2833SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2833SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2833S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2833S() {	 
			return (getShort(beginIp65504P2833S));
   	}
         int localIp65504P2833LCounter = -1;
         public boolean isIp65504P2833LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2833LCounter != sharedCounter;
            localIp65504P2833LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2833_L_LEN = 2;
  	/**
	 * serializeIp65504P2833L
	 */
	protected void serializeIp65504P2833L(short ip65504P2833L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2833L,IP_65504_P_2833_L_LEN)
                  ,beginIp65504P2833L
                  ,IP_65504_P_2833_L_LEN
                 );
            localIp65504P2833LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2833LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2833L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2833L() {	 
			return (getShort(beginIp65504P2833L));
   	}
         int localIp65504P2834SCounter = -1;
         public boolean isIp65504P2834SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2834SCounter != sharedCounter;
            localIp65504P2834SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2834_S_LEN = 2;
  	/**
	 * serializeIp65504P2834S
	 */
	protected void serializeIp65504P2834S(short ip65504P2834S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2834S,IP_65504_P_2834_S_LEN)
                  ,beginIp65504P2834S
                  ,IP_65504_P_2834_S_LEN
                 );
            localIp65504P2834SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2834SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2834S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2834S() {	 
			return (getShort(beginIp65504P2834S));
   	}
         int localIp65504P2834LCounter = -1;
         public boolean isIp65504P2834LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2834LCounter != sharedCounter;
            localIp65504P2834LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2834_L_LEN = 2;
  	/**
	 * serializeIp65504P2834L
	 */
	protected void serializeIp65504P2834L(short ip65504P2834L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2834L,IP_65504_P_2834_L_LEN)
                  ,beginIp65504P2834L
                  ,IP_65504_P_2834_L_LEN
                 );
            localIp65504P2834LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2834LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2834L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2834L() {	 
			return (getShort(beginIp65504P2834L));
   	}
         int localIp65504P2835SCounter = -1;
         public boolean isIp65504P2835SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2835SCounter != sharedCounter;
            localIp65504P2835SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2835_S_LEN = 2;
  	/**
	 * serializeIp65504P2835S
	 */
	protected void serializeIp65504P2835S(short ip65504P2835S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2835S,IP_65504_P_2835_S_LEN)
                  ,beginIp65504P2835S
                  ,IP_65504_P_2835_S_LEN
                 );
            localIp65504P2835SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2835SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2835S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2835S() {	 
			return (getShort(beginIp65504P2835S));
   	}
         int localIp65504P2835LCounter = -1;
         public boolean isIp65504P2835LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2835LCounter != sharedCounter;
            localIp65504P2835LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2835_L_LEN = 2;
  	/**
	 * serializeIp65504P2835L
	 */
	protected void serializeIp65504P2835L(short ip65504P2835L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2835L,IP_65504_P_2835_L_LEN)
                  ,beginIp65504P2835L
                  ,IP_65504_P_2835_L_LEN
                 );
            localIp65504P2835LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2835LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2835L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2835L() {	 
			return (getShort(beginIp65504P2835L));
   	}
         int localIp65504P2836SCounter = -1;
         public boolean isIp65504P2836SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2836SCounter != sharedCounter;
            localIp65504P2836SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2836_S_LEN = 2;
  	/**
	 * serializeIp65504P2836S
	 */
	protected void serializeIp65504P2836S(short ip65504P2836S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2836S,IP_65504_P_2836_S_LEN)
                  ,beginIp65504P2836S
                  ,IP_65504_P_2836_S_LEN
                 );
            localIp65504P2836SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2836SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2836S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2836S() {	 
			return (getShort(beginIp65504P2836S));
   	}
         int localIp65504P2836LCounter = -1;
         public boolean isIp65504P2836LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2836LCounter != sharedCounter;
            localIp65504P2836LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2836_L_LEN = 2;
  	/**
	 * serializeIp65504P2836L
	 */
	protected void serializeIp65504P2836L(short ip65504P2836L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2836L,IP_65504_P_2836_L_LEN)
                  ,beginIp65504P2836L
                  ,IP_65504_P_2836_L_LEN
                 );
            localIp65504P2836LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2836LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2836L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2836L() {	 
			return (getShort(beginIp65504P2836L));
   	}
         int localIp65504P2837SCounter = -1;
         public boolean isIp65504P2837SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2837SCounter != sharedCounter;
            localIp65504P2837SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2837_S_LEN = 2;
  	/**
	 * serializeIp65504P2837S
	 */
	protected void serializeIp65504P2837S(short ip65504P2837S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2837S,IP_65504_P_2837_S_LEN)
                  ,beginIp65504P2837S
                  ,IP_65504_P_2837_S_LEN
                 );
            localIp65504P2837SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2837SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2837S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2837S() {	 
			return (getShort(beginIp65504P2837S));
   	}
         int localIp65504P2837LCounter = -1;
         public boolean isIp65504P2837LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2837LCounter != sharedCounter;
            localIp65504P2837LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2837_L_LEN = 2;
  	/**
	 * serializeIp65504P2837L
	 */
	protected void serializeIp65504P2837L(short ip65504P2837L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2837L,IP_65504_P_2837_L_LEN)
                  ,beginIp65504P2837L
                  ,IP_65504_P_2837_L_LEN
                 );
            localIp65504P2837LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2837LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2837L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2837L() {	 
			return (getShort(beginIp65504P2837L));
   	}
         int localIp65504P2838SCounter = -1;
         public boolean isIp65504P2838SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2838SCounter != sharedCounter;
            localIp65504P2838SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2838_S_LEN = 2;
  	/**
	 * serializeIp65504P2838S
	 */
	protected void serializeIp65504P2838S(short ip65504P2838S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2838S,IP_65504_P_2838_S_LEN)
                  ,beginIp65504P2838S
                  ,IP_65504_P_2838_S_LEN
                 );
            localIp65504P2838SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2838SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2838S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2838S() {	 
			return (getShort(beginIp65504P2838S));
   	}
         int localIp65504P2838LCounter = -1;
         public boolean isIp65504P2838LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2838LCounter != sharedCounter;
            localIp65504P2838LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2838_L_LEN = 2;
  	/**
	 * serializeIp65504P2838L
	 */
	protected void serializeIp65504P2838L(short ip65504P2838L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2838L,IP_65504_P_2838_L_LEN)
                  ,beginIp65504P2838L
                  ,IP_65504_P_2838_L_LEN
                 );
            localIp65504P2838LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2838LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2838L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2838L() {	 
			return (getShort(beginIp65504P2838L));
   	}
         int localIp65504P2839SCounter = -1;
         public boolean isIp65504P2839SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2839SCounter != sharedCounter;
            localIp65504P2839SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2839_S_LEN = 2;
  	/**
	 * serializeIp65504P2839S
	 */
	protected void serializeIp65504P2839S(short ip65504P2839S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2839S,IP_65504_P_2839_S_LEN)
                  ,beginIp65504P2839S
                  ,IP_65504_P_2839_S_LEN
                 );
            localIp65504P2839SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2839SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2839S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2839S() {	 
			return (getShort(beginIp65504P2839S));
   	}
         int localIp65504P2839LCounter = -1;
         public boolean isIp65504P2839LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2839LCounter != sharedCounter;
            localIp65504P2839LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2839_L_LEN = 2;
  	/**
	 * serializeIp65504P2839L
	 */
	protected void serializeIp65504P2839L(short ip65504P2839L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2839L,IP_65504_P_2839_L_LEN)
                  ,beginIp65504P2839L
                  ,IP_65504_P_2839_L_LEN
                 );
            localIp65504P2839LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2839LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2839L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2839L() {	 
			return (getShort(beginIp65504P2839L));
   	}
         int localIp65504P2840SCounter = -1;
         public boolean isIp65504P2840SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2840SCounter != sharedCounter;
            localIp65504P2840SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2840_S_LEN = 2;
  	/**
	 * serializeIp65504P2840S
	 */
	protected void serializeIp65504P2840S(short ip65504P2840S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2840S,IP_65504_P_2840_S_LEN)
                  ,beginIp65504P2840S
                  ,IP_65504_P_2840_S_LEN
                 );
            localIp65504P2840SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2840SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2840S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2840S() {	 
			return (getShort(beginIp65504P2840S));
   	}
         int localIp65504P2840LCounter = -1;
         public boolean isIp65504P2840LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2840LCounter != sharedCounter;
            localIp65504P2840LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2840_L_LEN = 2;
  	/**
	 * serializeIp65504P2840L
	 */
	protected void serializeIp65504P2840L(short ip65504P2840L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2840L,IP_65504_P_2840_L_LEN)
                  ,beginIp65504P2840L
                  ,IP_65504_P_2840_L_LEN
                 );
            localIp65504P2840LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2840LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2840L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2840L() {	 
			return (getShort(beginIp65504P2840L));
   	}
         int localIp65504P2841SCounter = -1;
         public boolean isIp65504P2841SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2841SCounter != sharedCounter;
            localIp65504P2841SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2841_S_LEN = 2;
  	/**
	 * serializeIp65504P2841S
	 */
	protected void serializeIp65504P2841S(short ip65504P2841S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2841S,IP_65504_P_2841_S_LEN)
                  ,beginIp65504P2841S
                  ,IP_65504_P_2841_S_LEN
                 );
            localIp65504P2841SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2841SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2841S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2841S() {	 
			return (getShort(beginIp65504P2841S));
   	}
         int localIp65504P2841LCounter = -1;
         public boolean isIp65504P2841LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2841LCounter != sharedCounter;
            localIp65504P2841LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2841_L_LEN = 2;
  	/**
	 * serializeIp65504P2841L
	 */
	protected void serializeIp65504P2841L(short ip65504P2841L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2841L,IP_65504_P_2841_L_LEN)
                  ,beginIp65504P2841L
                  ,IP_65504_P_2841_L_LEN
                 );
            localIp65504P2841LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2841LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2841L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2841L() {	 
			return (getShort(beginIp65504P2841L));
   	}
         int localIp65504P2842SCounter = -1;
         public boolean isIp65504P2842SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2842SCounter != sharedCounter;
            localIp65504P2842SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2842_S_LEN = 2;
  	/**
	 * serializeIp65504P2842S
	 */
	protected void serializeIp65504P2842S(short ip65504P2842S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2842S,IP_65504_P_2842_S_LEN)
                  ,beginIp65504P2842S
                  ,IP_65504_P_2842_S_LEN
                 );
            localIp65504P2842SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2842SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2842S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2842S() {	 
			return (getShort(beginIp65504P2842S));
   	}
         int localIp65504P2842LCounter = -1;
         public boolean isIp65504P2842LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2842LCounter != sharedCounter;
            localIp65504P2842LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2842_L_LEN = 2;
  	/**
	 * serializeIp65504P2842L
	 */
	protected void serializeIp65504P2842L(short ip65504P2842L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2842L,IP_65504_P_2842_L_LEN)
                  ,beginIp65504P2842L
                  ,IP_65504_P_2842_L_LEN
                 );
            localIp65504P2842LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2842LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2842L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2842L() {	 
			return (getShort(beginIp65504P2842L));
   	}
         int localIp65504P2843SCounter = -1;
         public boolean isIp65504P2843SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2843SCounter != sharedCounter;
            localIp65504P2843SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2843_S_LEN = 2;
  	/**
	 * serializeIp65504P2843S
	 */
	protected void serializeIp65504P2843S(short ip65504P2843S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2843S,IP_65504_P_2843_S_LEN)
                  ,beginIp65504P2843S
                  ,IP_65504_P_2843_S_LEN
                 );
            localIp65504P2843SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2843SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2843S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2843S() {	 
			return (getShort(beginIp65504P2843S));
   	}
         int localIp65504P2843LCounter = -1;
         public boolean isIp65504P2843LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2843LCounter != sharedCounter;
            localIp65504P2843LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2843_L_LEN = 2;
  	/**
	 * serializeIp65504P2843L
	 */
	protected void serializeIp65504P2843L(short ip65504P2843L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2843L,IP_65504_P_2843_L_LEN)
                  ,beginIp65504P2843L
                  ,IP_65504_P_2843_L_LEN
                 );
            localIp65504P2843LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2843LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2843L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2843L() {	 
			return (getShort(beginIp65504P2843L));
   	}
         int localIp65504P2844SCounter = -1;
         public boolean isIp65504P2844SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2844SCounter != sharedCounter;
            localIp65504P2844SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2844_S_LEN = 2;
  	/**
	 * serializeIp65504P2844S
	 */
	protected void serializeIp65504P2844S(short ip65504P2844S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2844S,IP_65504_P_2844_S_LEN)
                  ,beginIp65504P2844S
                  ,IP_65504_P_2844_S_LEN
                 );
            localIp65504P2844SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2844SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2844S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2844S() {	 
			return (getShort(beginIp65504P2844S));
   	}
         int localIp65504P2844LCounter = -1;
         public boolean isIp65504P2844LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2844LCounter != sharedCounter;
            localIp65504P2844LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2844_L_LEN = 2;
  	/**
	 * serializeIp65504P2844L
	 */
	protected void serializeIp65504P2844L(short ip65504P2844L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2844L,IP_65504_P_2844_L_LEN)
                  ,beginIp65504P2844L
                  ,IP_65504_P_2844_L_LEN
                 );
            localIp65504P2844LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2844LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2844L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2844L() {	 
			return (getShort(beginIp65504P2844L));
   	}
         int localIp65504P2845SCounter = -1;
         public boolean isIp65504P2845SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2845SCounter != sharedCounter;
            localIp65504P2845SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2845_S_LEN = 2;
  	/**
	 * serializeIp65504P2845S
	 */
	protected void serializeIp65504P2845S(short ip65504P2845S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2845S,IP_65504_P_2845_S_LEN)
                  ,beginIp65504P2845S
                  ,IP_65504_P_2845_S_LEN
                 );
            localIp65504P2845SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2845SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2845S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2845S() {	 
			return (getShort(beginIp65504P2845S));
   	}
         int localIp65504P2845LCounter = -1;
         public boolean isIp65504P2845LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2845LCounter != sharedCounter;
            localIp65504P2845LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2845_L_LEN = 2;
  	/**
	 * serializeIp65504P2845L
	 */
	protected void serializeIp65504P2845L(short ip65504P2845L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2845L,IP_65504_P_2845_L_LEN)
                  ,beginIp65504P2845L
                  ,IP_65504_P_2845_L_LEN
                 );
            localIp65504P2845LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2845LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2845L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2845L() {	 
			return (getShort(beginIp65504P2845L));
   	}
         int localIp65504P2846SCounter = -1;
         public boolean isIp65504P2846SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2846SCounter != sharedCounter;
            localIp65504P2846SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2846_S_LEN = 2;
  	/**
	 * serializeIp65504P2846S
	 */
	protected void serializeIp65504P2846S(short ip65504P2846S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2846S,IP_65504_P_2846_S_LEN)
                  ,beginIp65504P2846S
                  ,IP_65504_P_2846_S_LEN
                 );
            localIp65504P2846SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2846SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2846S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2846S() {	 
			return (getShort(beginIp65504P2846S));
   	}
         int localIp65504P2846LCounter = -1;
         public boolean isIp65504P2846LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2846LCounter != sharedCounter;
            localIp65504P2846LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2846_L_LEN = 2;
  	/**
	 * serializeIp65504P2846L
	 */
	protected void serializeIp65504P2846L(short ip65504P2846L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2846L,IP_65504_P_2846_L_LEN)
                  ,beginIp65504P2846L
                  ,IP_65504_P_2846_L_LEN
                 );
            localIp65504P2846LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2846LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2846L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2846L() {	 
			return (getShort(beginIp65504P2846L));
   	}
         int localIp65504P2847SCounter = -1;
         public boolean isIp65504P2847SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2847SCounter != sharedCounter;
            localIp65504P2847SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2847_S_LEN = 2;
  	/**
	 * serializeIp65504P2847S
	 */
	protected void serializeIp65504P2847S(short ip65504P2847S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2847S,IP_65504_P_2847_S_LEN)
                  ,beginIp65504P2847S
                  ,IP_65504_P_2847_S_LEN
                 );
            localIp65504P2847SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2847SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2847S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2847S() {	 
			return (getShort(beginIp65504P2847S));
   	}
         int localIp65504P2847LCounter = -1;
         public boolean isIp65504P2847LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2847LCounter != sharedCounter;
            localIp65504P2847LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2847_L_LEN = 2;
  	/**
	 * serializeIp65504P2847L
	 */
	protected void serializeIp65504P2847L(short ip65504P2847L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2847L,IP_65504_P_2847_L_LEN)
                  ,beginIp65504P2847L
                  ,IP_65504_P_2847_L_LEN
                 );
            localIp65504P2847LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2847LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2847L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2847L() {	 
			return (getShort(beginIp65504P2847L));
   	}
         int localIp65504P2848SCounter = -1;
         public boolean isIp65504P2848SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2848SCounter != sharedCounter;
            localIp65504P2848SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2848_S_LEN = 2;
  	/**
	 * serializeIp65504P2848S
	 */
	protected void serializeIp65504P2848S(short ip65504P2848S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2848S,IP_65504_P_2848_S_LEN)
                  ,beginIp65504P2848S
                  ,IP_65504_P_2848_S_LEN
                 );
            localIp65504P2848SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2848SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2848S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2848S() {	 
			return (getShort(beginIp65504P2848S));
   	}
         int localIp65504P2848LCounter = -1;
         public boolean isIp65504P2848LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2848LCounter != sharedCounter;
            localIp65504P2848LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2848_L_LEN = 2;
  	/**
	 * serializeIp65504P2848L
	 */
	protected void serializeIp65504P2848L(short ip65504P2848L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2848L,IP_65504_P_2848_L_LEN)
                  ,beginIp65504P2848L
                  ,IP_65504_P_2848_L_LEN
                 );
            localIp65504P2848LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2848LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2848L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2848L() {	 
			return (getShort(beginIp65504P2848L));
   	}
         int localIp65504P2849SCounter = -1;
         public boolean isIp65504P2849SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2849SCounter != sharedCounter;
            localIp65504P2849SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2849_S_LEN = 2;
  	/**
	 * serializeIp65504P2849S
	 */
	protected void serializeIp65504P2849S(short ip65504P2849S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2849S,IP_65504_P_2849_S_LEN)
                  ,beginIp65504P2849S
                  ,IP_65504_P_2849_S_LEN
                 );
            localIp65504P2849SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2849SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2849S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2849S() {	 
			return (getShort(beginIp65504P2849S));
   	}
         int localIp65504P2849LCounter = -1;
         public boolean isIp65504P2849LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2849LCounter != sharedCounter;
            localIp65504P2849LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2849_L_LEN = 2;
  	/**
	 * serializeIp65504P2849L
	 */
	protected void serializeIp65504P2849L(short ip65504P2849L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2849L,IP_65504_P_2849_L_LEN)
                  ,beginIp65504P2849L
                  ,IP_65504_P_2849_L_LEN
                 );
            localIp65504P2849LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2849LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2849L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2849L() {	 
			return (getShort(beginIp65504P2849L));
   	}
         int localIp65504P2850SCounter = -1;
         public boolean isIp65504P2850SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2850SCounter != sharedCounter;
            localIp65504P2850SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2850_S_LEN = 2;
  	/**
	 * serializeIp65504P2850S
	 */
	protected void serializeIp65504P2850S(short ip65504P2850S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2850S,IP_65504_P_2850_S_LEN)
                  ,beginIp65504P2850S
                  ,IP_65504_P_2850_S_LEN
                 );
            localIp65504P2850SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2850SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2850S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2850S() {	 
			return (getShort(beginIp65504P2850S));
   	}
         int localIp65504P2850LCounter = -1;
         public boolean isIp65504P2850LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2850LCounter != sharedCounter;
            localIp65504P2850LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2850_L_LEN = 2;
  	/**
	 * serializeIp65504P2850L
	 */
	protected void serializeIp65504P2850L(short ip65504P2850L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2850L,IP_65504_P_2850_L_LEN)
                  ,beginIp65504P2850L
                  ,IP_65504_P_2850_L_LEN
                 );
            localIp65504P2850LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2850LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2850L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2850L() {	 
			return (getShort(beginIp65504P2850L));
   	}
         int localIp65504P2851SCounter = -1;
         public boolean isIp65504P2851SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2851SCounter != sharedCounter;
            localIp65504P2851SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2851_S_LEN = 2;
  	/**
	 * serializeIp65504P2851S
	 */
	protected void serializeIp65504P2851S(short ip65504P2851S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2851S,IP_65504_P_2851_S_LEN)
                  ,beginIp65504P2851S
                  ,IP_65504_P_2851_S_LEN
                 );
            localIp65504P2851SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2851SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2851S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2851S() {	 
			return (getShort(beginIp65504P2851S));
   	}
         int localIp65504P2851LCounter = -1;
         public boolean isIp65504P2851LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2851LCounter != sharedCounter;
            localIp65504P2851LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2851_L_LEN = 2;
  	/**
	 * serializeIp65504P2851L
	 */
	protected void serializeIp65504P2851L(short ip65504P2851L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2851L,IP_65504_P_2851_L_LEN)
                  ,beginIp65504P2851L
                  ,IP_65504_P_2851_L_LEN
                 );
            localIp65504P2851LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2851LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2851L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2851L() {	 
			return (getShort(beginIp65504P2851L));
   	}
         int localIp65504P2852SCounter = -1;
         public boolean isIp65504P2852SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2852SCounter != sharedCounter;
            localIp65504P2852SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2852_S_LEN = 2;
  	/**
	 * serializeIp65504P2852S
	 */
	protected void serializeIp65504P2852S(short ip65504P2852S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2852S,IP_65504_P_2852_S_LEN)
                  ,beginIp65504P2852S
                  ,IP_65504_P_2852_S_LEN
                 );
            localIp65504P2852SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2852SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2852S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2852S() {	 
			return (getShort(beginIp65504P2852S));
   	}
         int localIp65504P2852LCounter = -1;
         public boolean isIp65504P2852LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2852LCounter != sharedCounter;
            localIp65504P2852LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2852_L_LEN = 2;
  	/**
	 * serializeIp65504P2852L
	 */
	protected void serializeIp65504P2852L(short ip65504P2852L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2852L,IP_65504_P_2852_L_LEN)
                  ,beginIp65504P2852L
                  ,IP_65504_P_2852_L_LEN
                 );
            localIp65504P2852LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2852LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2852L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2852L() {	 
			return (getShort(beginIp65504P2852L));
   	}




}
  
