package com.cloudframe.app.vsammon4.dto;

/**
*  The class Input is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Input extends InputSerialized { 
   

						@Getter @Setter private char[] inputCommand = Field.fillLowValue(7);

						@Getter @Setter private char[] inputData = Field.fillLowValue(73);
				@Getter @Setter private OpenioData openioData = new OpenioData();
				@Getter @Setter private InsallData insallData = new InsallData();
				@Getter @Setter private InsertData insertData = new InsertData();
				@Getter @Setter private DeleteData deleteData = new DeleteData();
				@Getter @Setter private RewriteData rewriteData = new RewriteData();
				@Getter @Setter private KeyreadData keyreadData = new KeyreadData();
				@Getter @Setter private ReadallData readallData = new ReadallData();
				@Getter @Setter private StartData startData = new StartData();
	
	/**
	* Constructor for Input
	**/
    public Input() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Input. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Input(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getOpenioData().setParent(this,getStartOffset() + 7);
					getInsallData().setParent(this,getStartOffset() + 7);
					getInsertData().setParent(this,getStartOffset() + 7);
					getDeleteData().setParent(this,getStartOffset() + 7);
					getRewriteData().setParent(this,getStartOffset() + 7);
					getKeyreadData().setParent(this,getStartOffset() + 7);
					getReadallData().setParent(this,getStartOffset() + 7);
					getStartData().setParent(this,getStartOffset() + 7);
    } 



}
  
