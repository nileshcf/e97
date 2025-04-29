package com.cloudframe.app.sf305120.dto;

/**
*  The class FixedHeader801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FixedHeader801 extends FixedHeader801Serialized { 
   


								@Getter @Setter private short mipZLogLnth801;
				@Getter @Setter private MipZLogClassType801 mipZLogClassType801 = new MipZLogClassType801();

						@Getter @Setter private char[] mipZLogRefNum801 = new char[6];

						@Getter @Setter private char[] mipZLogBoxId801 = new char[3];

						@Getter @Setter private char[] mipZLogTime801 = new char[3];

						@Getter @Setter private char[] mipZLogDate801 = new char[3];

						@Getter @Setter private char[] mipZLogEtimeX801 = new char[4];

						@Getter @Setter private char[] zlogSr1LengthX801 = new char[2];

						@Getter @Setter private char[] zlogSr2LengthX801 = new char[2];
	
	/**
	* Constructor for FixedHeader801
	**/
    public FixedHeader801() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FixedHeader801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FixedHeader801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMipZLogClassType801().setParent(this,getStartOffset() + 15);
       replaceValue( // serialize and save the value
             fillLowValue(13)
             , getStartOffset() + 0
             ,13
             );
								setMipZLogLnth801((short)0);
								setMipZLogRefNum801(fillSpace(6));
								setMipZLogBoxId801(fillSpace(3));
								setMipZLogTime801(fillSpace(3));
								setMipZLogDate801(fillSpace(3));
								setMipZLogEtimeX801("0000".toCharArray());
								setZlogSr1LengthX801("00".toCharArray());
								setZlogSr2LengthX801("00".toCharArray());
    } 



}
  
