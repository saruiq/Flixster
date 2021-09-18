# Flix
Flix is an app that allows users to browse movies from the [The Movie Database API](http://docs.themoviedb.apiary.io/#).

## Flix Part 2

### User Stories

#### REQUIRED (10pts)

- [x] (8pts) Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.
- [x] (2pts) Allow video posts to be played in full-screen using the YouTubePlayerView.

#### BONUS

- [ ] Implement a shared element transition when user clicks into the details of a movie (1 point).
- [ ] Trailers for popular movies are played automatically when the movie is selected (1 point).
  - [ ] When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
  - [ ] Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
- [ ] Add a play icon overlay to popular movies to indicate that the movie can be played (1 point).
- [ ] Apply data binding for views to help remove boilerplate code. (1 point)
- [ ] Add a rounded corners for the images using the Glide transformations. (1 point)
- [x] Improved the user interface by experimenting with styling and coloring.

### App Walkthough GIF

<img src="walkthrough_part_two.gif" width=250><br>

GIF created with [LiceCap](http://www.cockos.com/licecap/).

### Notes

Describe any challenges encountered while building the app.

Some challenges that I faced while building this app is that while testing to see if my emulator had Google Play services installed, I opened up the YouTube app but I couldn't see the videos because it said that I didn't have a WiFi connection. I fixed this problem by using Google, fixing some specific settings on my laptop, and restarting my emulator. I also tried completeing a stretch story where I include the release date of the movie, alongside the title, overview, rating and the trailer. However, I wasn't able to figure it out. I hope that I can revisit this project so and try to finish the stretch story, as well as try out the other stretch stories given to me. In general, Android Studio was still slow and glitchy at times, but I was still able to finish my app successfully and add some cool ui improvemnets!

## Open-source libraries used
- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

---

## Flix Part 1

### User Stories

#### REQUIRED (10pts)
- [x] (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS
- [x] (2pts) Views should be responsive for both landscape/portrait mode.
   - [x] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [x] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.

- [ ] (2pts) Display a nice default [placeholder graphic](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
- [ ] (2pts) Improved the user interface by experimenting with styling and coloring.
- [ ] (2pts) For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous RecyclerViews and use different ViewHolder layout files for popular movies and less popular ones.

### App Walkthough GIF

<img src="walkthrough.gif" width=250><br>

GIF created with [LiceCap](http://www.cockos.com/licecap/).

### Notes
Describe any challenges encountered while building the app.

Some challenges I encountered while building the app were that I think on my laptop, Android Studio loads super slow, and sometimes even freezes or glitches. So, as I was coding, it was very difficult to make sure everything worked smoothly. I also had some issues with my emulator crashing at times, but after checking the Slack channel, someone has a similar problem as me and said to reboot the emulator, which helped a lot. There was also issue with my emulator not turning sideways, which I just had to press the auto rotate button on the emulator. Lastly, at the beginning, where we ran the app in debug mode to check whether Android Studio is successfully connecting to the API, mine app kept reaching onFailure. However, I fixed that problem by deleting the app on the emulator and running the program again. Other than that, I was able to get through the tutorials and create the app!

### Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids
