<TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="116dp"
        android:layout_marginBottom="60dp"
        android:text="Welcome !!"
        android:textColor="@color/Red"
        android:textSize="40sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/etfirstName"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/etfirstName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="47dp"
        android:layout_marginBottom="35dp"
        android:ems="10"
        android:hint="Enter FirstName"
        android:autofillHints="name"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toTopOf="@+id/etLastName"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <EditText
        android:id="@+id/etLastName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="35dp"
        android:layout_marginBottom="47dp"
        android:ems="10"
        android:hint="Enter LastName"

        android:inputType="textPersonName"
        app:layout_constraintBottom_toTopOf="@+id/etPhoneNumber"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/etfirstName" />

    <EditText
        android:id="@+id/etPhoneNumber"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="Enter PhoneNo."
        android:inputType="number"
        app:layout_constraintBottom_toTopOf="@+id/Load_btn"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/etLastName" />

    <Button
        android:id="@+id/Load_btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"

        android:layout_marginTop="18dp"
        android:layout_marginBottom="66dp"
        android:text="Load"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/save_btn"
        app:layout_constraintTop_toBottomOf="@+id/etPhoneNumber" />

    <Button
        android:id="@+id/save_btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="18dp"
        android:layout_marginBottom="66dp"
        android:text="Save"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/Load_btn"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/etPhoneNumber" />