package com.example.android.sunshine.databinding;
import com.example.android.sunshine.R;
import com.example.android.sunshine.BR;
import android.view.View;
public class ExtraWeatherDetailsBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.horizontal_middle, 1);
        sViewsWithIds.put(R.id.humidity_label, 2);
        sViewsWithIds.put(R.id.humidity, 3);
        sViewsWithIds.put(R.id.pressure_label, 4);
        sViewsWithIds.put(R.id.pressure, 5);
        sViewsWithIds.put(R.id.wind_label, 6);
        sViewsWithIds.put(R.id.wind_measurement, 7);
    }
    // views
    public final android.support.constraint.ConstraintLayout extraDetails;
    public final android.support.constraint.Guideline horizontalMiddle;
    public final android.widget.TextView humidity;
    public final android.widget.TextView humidityLabel;
    public final android.widget.TextView pressure;
    public final android.widget.TextView pressureLabel;
    public final android.widget.TextView windLabel;
    public final android.widget.TextView windMeasurement;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ExtraWeatherDetailsBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.extraDetails = (android.support.constraint.ConstraintLayout) bindings[0];
        this.extraDetails.setTag(null);
        this.horizontalMiddle = (android.support.constraint.Guideline) bindings[1];
        this.humidity = (android.widget.TextView) bindings[3];
        this.humidityLabel = (android.widget.TextView) bindings[2];
        this.pressure = (android.widget.TextView) bindings[5];
        this.pressureLabel = (android.widget.TextView) bindings[4];
        this.windLabel = (android.widget.TextView) bindings[6];
        this.windMeasurement = (android.widget.TextView) bindings[7];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ExtraWeatherDetailsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtraWeatherDetailsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ExtraWeatherDetailsBinding>inflate(inflater, com.example.android.sunshine.R.layout.extra_weather_details, root, attachToRoot, bindingComponent);
    }
    public static ExtraWeatherDetailsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtraWeatherDetailsBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.android.sunshine.R.layout.extra_weather_details, null, false), bindingComponent);
    }
    public static ExtraWeatherDetailsBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtraWeatherDetailsBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/extra_weather_details_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ExtraWeatherDetailsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}