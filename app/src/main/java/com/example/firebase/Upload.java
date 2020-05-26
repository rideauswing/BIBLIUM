package com.example.firebase;

public class Upload {
    private String mName;
    private String mDescription;
    private String mPdfURL;
    private String mImageUrl;

    public Upload(){
        //empty constructor needed

    }
    public Upload(String name, String description, String PdfURL, String imageUrl){
        if(name.trim().equals("")){
            name = "No name";
        }
        mName = name;
        mImageUrl = imageUrl;
        mDescription = description;
        mPdfURL = PdfURL;
    }
    public String getmName(){
        return mName;
    }
    public void setmName(String name){
        mName = name;
    }
    public String getmImageUrl(){
        return mImageUrl;

    }
    public void setmDescription(String description){
        mDescription = description;
    }
    public String getmDescription(){return mDescription;}
    public void setmImageUrl(String imageUrl){mImageUrl = imageUrl;}

    public String getmPdfURL(){return mPdfURL; }


}
