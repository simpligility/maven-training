/* global module:false */
module.exports = function(grunt) {
  var port = grunt.option('port') || 8000;
  // Project configuration
  grunt
      .initConfig({
        pkg : grunt.file.readJSON('package.json'),
        meta : {
          banner : '/*!\n* reveal.js <%= pkg.version %>\n*/'
        },

        uglify : {
          options : {
            banner : '<%= meta.banner %>\n'
          },
          build : {
            src : 'js/reveal.js',
            dest : 'js/reveal.min.js'
          }
        },

        cssmin : {
          compress : {
            files : {
//              'css/reveal.min.css' : [ 'css/reveal.css' ]
            }
          }
        },

        sass : {
          main : {
            files : {
              'css/theme/default.css' : 'css/theme/source/default.scss',
              'css/theme/beige.css' : 'css/theme/source/beige.scss',
              'css/theme/night.css' : 'css/theme/source/night.scss',
              'css/theme/serif.css' : 'css/theme/source/serif.scss',
              'css/theme/simple.css' : 'css/theme/source/simple.scss',
              'css/theme/sky.css' : 'css/theme/source/sky.scss',
              'css/theme/moon.css' : 'css/theme/source/moon.scss',
              'css/theme/solarized.css' : 'css/theme/source/solarized.scss',
              'css/theme/blood.css' : 'css/theme/source/blood.scss'
            }
          }
        },

        jshint : {
          options : {
            curly : false,
            eqeqeq : true,
            immed : true,
            latedef : true,
            newcap : true,
            noarg : true,
            sub : true,
            undef : true,
            eqnull : true,
            browser : true,
            expr : true,
            globals : {
              head : false,
              module : false,
              console : false,
              unescape : false
            }
          },
          files : [ 'Gruntfile.js', 'js/reveal.js' ]
        },

        connect : {
          server : {
            options : {
              port : port,
              base : '.'
            }
          }
        },

        zip : {
          'target/takari-training-presentation.zip' : [ 'installing-running-maven.html',
              'intro-to-maven.html', 'css/**', 'js/**', 'lib/**', 'img/**',
              'plugin/**' ],
          'target/takari-training-materials.zip' : [ 'takari-training-labs/**',
              'takari-training-slides/**']
        },

        watch : {
          main : {
            files : [ 'Gruntfile.js', 'js/reveal.js', 'css/reveal.css' ],
            tasks : 'default'
          },
          theme : {
            files : [ 'css/theme/source/*.scss', 'css/theme/template/*.scss' ],
            tasks : 'themes'
          }
        }

      });

  // Dependencies
  grunt.loadNpmTasks('grunt-contrib-qunit');
  grunt.loadNpmTasks('grunt-contrib-jshint');
  grunt.loadNpmTasks('grunt-contrib-cssmin');
  grunt.loadNpmTasks('grunt-contrib-uglify');
  grunt.loadNpmTasks('grunt-contrib-watch');
  grunt.loadNpmTasks('grunt-contrib-sass');
  grunt.loadNpmTasks('grunt-contrib-connect');
  grunt.loadNpmTasks('grunt-zip');

  // Default task
  grunt.registerTask('default', [ 'jshint', 'cssmin', 'uglify' ]);

  // Theme task
  grunt.registerTask('themes', [ 'sass' ]);

  // Package presentation to archive
  grunt.registerTask('package', [ 'default', 'zip' ]);

  // Serve presentation locally
  grunt.registerTask('serve', [ 'connect', 'watch' ]);

  // Run tests
  grunt.registerTask('test', [ 'jshint', 'qunit' ]);

};
