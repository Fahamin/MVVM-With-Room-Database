# MVVM-With-Room-Database

    dataBinding {
        enabled = true
    }
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'androidx.appcompat:appcompat:1.0.0'
    implementation 'com.google.android.material:material:1.0.0'
    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'androidx.test.ext:junit:1.1.1'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.0'


    // recycler view , card view
    implementation 'androidx.recyclerview:recyclerview:1.0.0'
    implementation 'androidx.cardview:cardview:1.0.0'

    def lifecycle_version = "1.1.1"
    // ViewModel and LiveData
    implementation 'androidx.lifecycle:lifecycle-extensions:2.0.0'
    annotationProcessor 'androidx.lifecycle:lifecycle-compiler:2.0.0'

    // add sdp lib
    implementation 'com.intuit.sdp:sdp-android:1.0.6'


    // Add Room Database
    implementation 'androidx.room:room-runtime:2.0.0'
    annotationProcessor 'androidx.room:room-compiler:2.0.0'

    //  Add EventBus lib
    implementation 'org.greenrobot:eventbus:3.1.1'

