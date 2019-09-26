ImageView imageView = (ImageView) findViewById(R.id.spaceshipImage);
Animation animation = AnimationUtils.loadAnimation(this, R.anim.hyperspace_jump); //load animation
animation.startAnimation(imageView);   //apply animation to view
